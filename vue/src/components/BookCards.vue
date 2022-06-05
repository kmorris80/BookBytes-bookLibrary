<template>
    <div class="book-card">
        <div>
        <!-- Cover page of book perhaps -->
         <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
        <h2>{{ book.title }}</h2>
        <h2>by {{ book.author }}</h2>
        <button class="btn btn-secondary" v-if="enableAdd">Add Book to My Reading List</button>
        <div v-if="! enableAdd">
            <label for="checkbox"  id="checkbox-text">Have you read this book? </label>
            <input type="checkbox" id="is-read" class="form-check-input">
        </div>
        </div>
    </div>
     
</template>

<script>

export default {
    name: "book-card",
    props: { book: Object,
            enableAdd: {
                type: Boolean, 
                default: false
            },
    }
}
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

</style>