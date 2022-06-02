<template>
  <div class="home">
    <header>
      <h1 id="welcome">Let's Get Moving!</h1>
      <div id="add-kid">
      <!-- <button @click="showForm = !showForm">Add Kid</button> -->
      </div>
      
      <!-- <add-kid v-show="showForm"></add-kid> -->
    </header>

    <book-cards v-for="book in books" :key="book.id"></book-cards>
    <book-cards></book-cards>
    
  </div>
</template>

<script>
import bookCards from '../components/BookCards.vue';
import bookService from '../services/BookService'


export default {
  name: "home",
  components: {
    bookCards,
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
.home {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  gap: 20px;

  grid-template-areas: 
  "header header header header"
  "card card card card"
  ;
}

header {
  grid-area: header;
}

kid-cards {
  grid-area: card;
}

#welcome {
  text-align: center;
  margin: 50px;
}
</style>