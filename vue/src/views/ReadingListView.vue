<template>
    <div class="reading-list">
        <header>
          <h1>Welcome to Your Reading List</h1>
        </header>
      <div id="book-cards">
        <book-cards v-for="book in books" v-bind:key="book.id" :book="book" v-bind:enableAdd="false"></book-cards>
      </div>
    </div>
</template>

<script>
import BookCards from '../components/BookCards.vue'
import bookService from '../services/BookService.js'

export default {
    name: "readingList",
    components: {
     BookCards,
    
},
data() {
    return {
      books: []
    }
  },
  created() {
    bookService.list().then(response =>{
      this.books = response.data;
    })
  },
}
</script>

<style scoped>
.reading-list {
 background-image: url(../assets/library-background.jpeg);
  background-repeat: none;
  height: 100vh;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;

}

#book-cards {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  gap: 25px;
  margin: 20px;
}

</style>