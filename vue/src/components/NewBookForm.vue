<template>
  <div class="text-center">
    <form class="new-book-form" v-on:submit.prevent="saveBook">
      <div class="input">
        <input
          class="form-control"
          type="text"
          placeholder="Title"
          v-model="book.title"
        />
        <input
          class="author-input form-control"
          type="text"
          placeholder="Author"
          v-model="book.author"
        />
        <input
          class="form-control"
          type="text"
          placeholder="Genre"
          v-model="book.genre"
        />
        <input
          class="form-control"
          type="text"
          placeholder="Keyword"
          v-model="book.keyword"
        />
        <input
          class="form-control"
          type="text"
          placeholder="Character"
          v-model="book.character"
        />
         <input
          class="form-control"
          type="text"
          placeholder="ISBN"
          v-model="book.isbn"
        />
      </div>
      <!-- <div>
        <label for="new-release-input" id="checkbox-text">New Release:</label>
        <input
          class="form-check-input"
          id="checkbox-text"
          type="checkbox"
          placeholder="New Release"
          v-model="book.newRelease"
        />
      </div> -->
      <button class="btn btn-primary btn-lg">Save</button>
    </form>
  </div>
</template>

<script>
import bookService from "../services/BookService.js";
export default {
  name: "new-book-form",

  data() {
    return {
      book: {
        title: "",
        author: "",
        genre: "",
        keyword: "",
        character: "",
        isbn:"",
        newRelease: false,
      },
    };
  },
  methods: {
    
      // const newBook ={
      //   title: this.book.title,
      //   author: this.book.author,
      //   genre: this.book.genre,
      //   keyword: this.book.keyword,
      //   character: this.book.character
      // }
       saveBook() {
        bookService
        .create(this.book)
        .then((response)=>{
          if(response.status === 201){
            window.alert("Book Created!");
            this.$router.push(`/addBook`)
          }
        })
        // .catch(error =>{

       
      }
      //alternative method for adding book?
      // bookService.create(this.book).then((response) => {
      //   if (response.status == 201) {
      //    
      //     this.$router.push("/addBook");
      //   }
      // }
    }
  }

</script>
<style scoped>
input {
  margin-bottom: 20px;
  margin-top: 5px;

  border: solid 2px;
  font-size: 20px;
}

.input {
  padding-left: 500px;
  padding-right: 500px;
}

#checkbox-text {
  font-size: 20px;
  font-weight: bolder;
}
</style>