<template>
  <div class="home">
    <header>
      <h1 id="welcome">Let's Get Moving!</h1>
    </header>
    <kid-cards></kid-cards>
    <kid-cards></kid-cards>
    <kid-cards></kid-cards>
    <kid-cards></kid-cards>
  
    
  </div>
</template>

<script>
import kidCards from '../components/KidCards.vue';

export default {
  name: "home",
  components: {
    kidCards
  }
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