//should include list function
<template>
  <div>
    <h1>Topic Message Board</h1>
    <topicList></topicList>
  </div>
</template>

<script>
import topicList from '../components/TopicList.vue'
import forumService from '../services/ForumService.js'

export default {
    name: 'forum',
    components:{
        topicList,
    },
    data(){
    return{
        topics: [],
    };
        

    },
createTopicList(){
    forumService.list().then((response) => {
        this.topics=response.data;
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
  text-shadow: -2px -2px 0 #000, 2px -2px 0 #000, -2px 2px 0 #000,
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
  background-attachment: fixed;
}
header{
  text-align: center;
  padding: 50px;
}
</style>

