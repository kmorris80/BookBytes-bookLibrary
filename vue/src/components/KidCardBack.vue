<template>
 <div class="text-center">
   <form>
      <div>
        <h1 class="h3 mb-3 font-weight-normal">Enter Activity Minutes or Steps</h1>
      </div>
      <div id="input-section">
      <label for="name" class="sr-only">Activity Minutes:</label>
      <input type="text" id="username" class="form-control">
      <label for="name" class="sr-only">Steps:</label>
      <input type="text" id="username" class="form-control">
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Submit
      </button> 
    </form> 
  </div> 
</template>



<style scoped>

input {
  margin-bottom: 20px;
  margin-top: 5px;
  border: solid 2px;
  text-align: center;
  
}
label{
    font-size: 2em;
}
#input-section {
padding-left: 100px;
padding-right: 100px;

}





</style>