<template>
    <div class="all-books">
        <book-cards :enable-add="true"></book-cards>
        <!-- <book-cards :enable-add="true" v-for="book in books" :key="book.id"></book-cards> -->
    </div>
</template>

<script>

import bookService from "../services/BookService"
import BookCards from '../components/BookCards.vue';

export default {
    name: "all-books",
    components: {
        BookCards
    },
    data() {
        return {
            books: [] 
        }
    },
    list() {
        bookService.list().then((response) => {
            this.book = response.data;
        })
    },

}
</script>

<style scoped>

</style>