<template>
  <div class="book-card">
    <div>
      <img
        v-if="book.isbn"
        v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'"
      />
      <h2>{{ book.title }}</h2>
      <h2>by {{ book.author }}</h2>
      <button class="btn btn-secondary" v-if="enableAdd" @click.prevent="addToReadingList(book)">
        Add Book to My Reading List
      </button>
      <div v-if="!enableAdd">
        <button class="btn btn-secondary" v-if="!isRead" @click.prevent="toggleReadButton">Mark Read</button>
        <button class="btn btn-secondary" v-if="isRead" @click.prevent="toggleReadButton">Mark Unread</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "book-card",
  props: {
    book: Object,
    enableAdd: {
      type: Boolean,
      default: false,
    },
  },
  data() {
    return {
      isRead: false,
    }
  },
  methods: {
      addToReadingList(book) {
          let addedBook = Object.assign(book);
          this.$store.commit('SAVE_BOOK', addedBook)
          window.alert("Successfully added!")
      },
      toggleReadButton() {
        this.isRead = !this.isRead;
      }
  }
};
</script>

<style scoped>
.book-card {
  border: solid 10px;
  background-color: #86cacd;
  text-align: center;
  border-radius: 25px;
}

h2 {
  margin-left: 20px;
  margin-right: 20px;
  border-radius: 10px;
}

img {
  height: 20vh;
  padding: 10px;
}

button {
  margin-bottom: 10px;
}
#checkbox-text{
  font-size: 20px;
}
</style>