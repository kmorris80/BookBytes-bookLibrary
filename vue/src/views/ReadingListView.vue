<template>
    <div>
        <h1>Welcome to Your Reading List</h1>

        <reading-list></reading-list>

    </div>
</template>

<script>
import readingList from '../components/ReadingList.vue'
import bookService from '../services/BookService.js'

export default {
    name: "readingList",
    components: {
     readingList,
    
},
data() {
    return {
      books: []
    }
  },
  created() {
    bookService.getReadingList(this.userID).then((response) => {
      this.books = response.data;
    });
  },
}
</script>

<style scoped>

</style>