<template >
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <header class="one">
      <h1 class="h1 mb-3 font-weight-normal" id="welcome-banner">Start Your Book Adventure!</h1>
      </header>
      <div class ="two">
      <img id = "swim" src="../assets/CityBooks.jpeg"/>
      </div>
      <h1 class="h1 mb-3 font-weight-normal" id="sign-in">Please Sign In</h1>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      
      <label for="username" class="sr-only">Username</label>
      <div class="input">
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
     
      <label for="password" class="sr-only">Password</label>
       <input
         type="password"
         id="password"
         class="form-control"
         placeholder="Password"
         v-model="user.password"
         required
       />
      </div>
      <div>
      <button class="btn btn-lg btn-primary btn-block" type="submit" id = "submit">Sign in</button>
     </div>
    <router-link :to="{ name: 'register' }">Need an account?</router-link>
  </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            // if(response.data.user.is_system_admin == false) {
              this.$router.push("/");
            // }else {
            //   this.$router.push("/addBook")
            // }
            
            // if isSystemAdmin this.$router.push("/addBook")
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
 
    }
  
};
</script>

<style scoped>
/* #login{
display: grid;
grid-template-columns: 1fr, 1fr, 1fr;
gap: 10px;
grid-template-areas: 
"header    header   header   header"
 "picture  sign-in  sign-in  sign-in"  
 "picture  input    input   input" */


 img{
    max-width: 50%;
    height:auto;
    grid-area: picture;
  }

.input {
  padding-left: 500px;
  padding-right: 500px;
  grid-area: input;
}

#welcome-banner{
  font-size: 4em;
  padding: 15px;
}
.two{
  grid-area: picture;
}
.sign-in{
  grid-area: sign-in;
}

label {
  font-size: 2rem;
}

input {
  margin-bottom: 20px;
  margin-top: 5px;
  border: solid 2px;
  font-size: 20px;
}

#checkbox-text {
  font-size: 20px;
  font-weight: bolder;
}


</style>