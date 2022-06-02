<template>
    <div class="book-card">
        <!-- Cover page of book perhaps -->
        <h2>{{ book.title }}</h2>
        <!-- <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" /> -->
        <h2>by {{ book.author }}</h2>
        <h2>{{ book.isbn }}</h2>
        <label for="checkbox"  id="checkbox-text">Have you read this book? </label>
        <input type="checkbox" id="is-read" class="form-check-input" v-model="book.isRead">
    </div>
     
</template>

<script>

import bookService from "../services/BookService"

export default {
    name: "book-detail",
    data() {
        return {
            book: {
                id: null,
                title: "",
                author: "",
                isbn: "",
                isRead: false,
            }
        }
    },
    created() {
        bookService.get(this.$route.params.id).then((response) => {
            this.book = response.data;
        })
    },
}
</script>

<style scoped>

.book-card {
    border: solid 10px;
    background-color: #86cacd;
    text-align: center;
    border-radius: 25px    
}

h2 {
    border: solid 1px;
    margin-left: 20px;
    margin-right: 20px; 
    border-radius: 10px;
}

img {
    height: 20vh;
    padding: 10px;
}

</style>