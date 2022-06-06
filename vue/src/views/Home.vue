<template>
  <div class="home">
 
    <header>
        <h1 id="welcome">Let's Get Reading!</h1>
    </header>
    <search-bar :books="books"></search-bar>
    <div id="book-cards">
      <book-cards v-for="book in books" v-bind:key="book.id" :book="book" v-bind:enableAdd="true"></book-cards>
    </div>
  </div>
</template>

<script>
import bookService from '../services/BookService'
import searchBar from '../components/SearchBar.vue'
import BookCards from '../components/BookCards.vue'

export default {
  name: "home",
  components: {
    BookCards,
    searchBar,
  },
  data() {
    return {
      books: []
    }
  },
  created() {
    bookService.list().then((response) => {
      this.books = response.data;
    });
  },
};
</script>

<style scoped>



#welcome {
  text-align: center;
  padding: 50px;
  color: white;
  font-weight: bolder;
  font-size: 100px;
  text-shadow:
		-2px -2px 0 #000,
		2px -2px 0 #000,
		-2px 2px 0 #000,
		2px 1px 0 #000;
}

#book-cards {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  gap: 25px;
  margin: 20px;
}
.home {
 background-image: url(../assets/library-background.jpeg);
  background-repeat: none;
  height: 100vh;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>