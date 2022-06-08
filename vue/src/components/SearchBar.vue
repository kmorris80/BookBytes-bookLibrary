<template>
  <div id="searchBooks">
    <div class="search">
      <div class="title-input spacing" id="title-field">
        <input
           class="form-control form-control-lg"
          id="inputLarge"
          type="text"
          placeholder="Title"
          v-model="filter.title"
        />
      </div>
      <div class="author-input spacing" id="author-field">
        <input
           class="form-control form-control-lg"
          id="inputLarge"
          type="text"
          placeholder="Author"
          v-model="filter.author"
        />
      </div>
      <div class="character-input spacing" id="character-field">
        <input
          class="form-control form-control-lg"
          id="inputLarge"
          type="text"
          placeholder="Character"
          v-model="filter.character"
        />
      </div>
      <div class="genre-input spacing" id="genre-field">
        <input
          class="form-control form-control-lg"
          id="inputLarge"
          type="text"
          placeholder="Genre"
          v-model="filter.genre"
        />
      </div>
      <div class="keyword-input spacing" id="keyword-field">
        <input
           class="form-control form-control-lg"
          id="inputLarge"
          type="text"
          placeholder="Keyword"
          v-model="filter.keyword"
        />
      </div>
    </div>
    <div id="book-cards">
      <book-cards
        v-for="book in filteredBooks"
        :key="book.id"
        :book="book"  
        :enableAdd="true"
      ></book-cards>
    </div>
  </div>
</template>

<script>
import BookCards from "../components/BookCards.vue";

export default {
  components: { BookCards },
  name: "book-list",
  props: {
    books: Array,  
    //getting the array of books from "Home View"
  },
  data() {
    return {
      filter: {
        title: "",
        author: "",
        character: "",
        genre: "",
        keyword: "",
      },
    };
  },
  computed: {
    filteredBooks() {
      let filteredBooks = this.books;
      if (this.filter.title != "") {
        filteredBooks = filteredBooks.filter((book) =>
          book.title.toLowerCase().includes(this.filter.title.toLowerCase())
        );
      }
      if (this.filter.author != "") {
        filteredBooks = filteredBooks.filter((book) =>
          book.author.toLowerCase().includes(this.filter.author.toLowerCase())
        );
      }
      if (this.filter.character != "") {
        filteredBooks = filteredBooks.filter((book) =>
          book.character
            .toLowerCase()
            .includes(this.filter.character.toLowerCase())
        );
      }
      if (this.filter.genre != "") {
        filteredBooks = filteredBooks.filter((book) =>
          book.genre.toLowerCase().includes(this.filter.genre.toLowerCase())
        );
      }
      if (this.filter.keyWord != "") {
        filteredBooks = filteredBooks.filter((book) =>
          book.keyword.toLowerCase().includes(this.filter.keyword.toLowerCase())
        );
      }
      return filteredBooks;
    },
  },
};
</script>



<style scoped>
.spacing {
  padding: 5px;
}

.search {
  display: flex;
  padding-bottom: 20px;
  justify-content: center;
}

#book-cards {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  gap: 25px;
  margin: 20px;
}

input {
outline: solid 2px #f3969a;

}
</style>
