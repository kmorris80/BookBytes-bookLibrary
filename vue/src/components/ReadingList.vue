<template>
    <div class="book-container">
 <book-cards v-bind:book="book" v-for="book in books" v-bind:key="book.id"/>
    </div>
</template>

<script>
import BookCards from '../components/BookCards.vue';

export default {
    name: 'reading-list',
    components: {
        BookCards
    }
    
}
</script>

<style scoped>

</style>