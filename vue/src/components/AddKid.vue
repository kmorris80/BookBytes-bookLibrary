<template>
 <div class="text-center">
   <form>
      <div>
        <h1 class="h1 mb-3 font-weight-normal">Create Kid Account</h1>
      </div>
      <label for="name" class="sr-only">Name</label>
      <input type="text" id="username" class="form-control" v-model="name">
      <label for="name" class="sr-only">Username</label>
      <input type="text" id="username" class="form-control">
      <label for="name" class="sr-only">Password</label>
      <input type="text" id="username" class="form-control">
      <button class="btn btn-lg btn-primary btn-block" type="submit">
      Create Account
      </button>
    </form> 
  </div> 
</template>

// <script>
// export default {
//   data() {
//     return {
//       name: '',
//     }
//   },
// };
// </script>

<style scoped>

input {
  margin-bottom: 20px;
  margin-top: 5px;
  border: solid 1px;
}

label {
  font-size: 2rem;
}

</style>