<template>
  <div id="register" class="text-center">
    <form class="form-register" @submit.prevent="register">
      <h1 class="h1 mb-3 font-weight-normal" id="create">Create Parent or Kid Account</h1>
       <div>
       <img id = "soccer" src="../assets/soccer.png"/>
      </div>
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
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
        <input
          type="password"
          id="confirmPassword"
          class="form-control"
          placeholder="Confirm Password"
          v-model="user.confirmPassword"
          required
        />
      </div>
      <div>
        <label for="checkbox"  id="checkbox-text">IMPORTANT - Please check if you are a parent:</label>
        <input 
          type="checkbox"
          class="form-check-input"
          id="isParent"
          v-model="user.isParent"
        />  
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button> 
    </form>
    <router-link :to="{ name: 'login' }">Have an account?</router-link>
  </div>
</template>

<script>
import authService from '../services/AuthService';

export default {
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
        isParent: false,
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'Bad Request: Validation Errors';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
};
</script>

<style scoped>

input {
  margin-bottom: 20px;
  margin-top: 5px;
  border: solid 2px;
  font-size: 20px;
}
label {
  font-size: 2rem;
}

#checkbox-text {
  font-size: 20px;
  font-weight: bolder;
}

#isParent {
  margin-left: 5px;
}

.input {
  padding-left: 500px;
  padding-right: 500px;
}
#create{
  padding-top: 30px;
  padding-bottom: 0px;
}

 img{
    max-width: 30%;
    height:auto;
  }
</style>