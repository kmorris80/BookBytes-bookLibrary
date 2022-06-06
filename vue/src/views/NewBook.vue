<template>
    <div id="bookForm">
        <new-book-form/>
    </div>
</template>

<script>
import  NewBookForm  from '../components/NewBookForm.vue'

export default {
    components: {NewBookForm}
}
</script>

<style scoped>
#bookForm {
 background-image: url(../assets/bookStack.jpeg);
  background-repeat: none;
  height: 100vh;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;

}
header{
  text-align: center;
  padding: 50px;
}
</style>