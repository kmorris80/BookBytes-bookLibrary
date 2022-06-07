<template>
    <form v-on:submit.prevent>
        <div class="field">
            <label for="Title">Title</label>
            <input type="text" v-model="forum.forumTopic"/>
        </div>
        <div class="actions">
            <button type="submit" v-on:click="saveTopic()">Save Topic</button>
        </div>
    </form>
</template>

<script>
import forumService from '../services/ForumService';

export default {
    name: "create-topic",
    data(){
        return{
            topic:{
                id: Math.floor(Math.random() * (1000-100)+100),
                title: ""
            }
        };
    },
    methods:{
        saveTopic(){
            forumService
            .create(this.forumTopic)
            .then((response)=>{
                if(response.status === 201){
                    this.$router.push("/ForumView");
                }
            })

        }
    }
};
</script>

<style>
form {
  padding: 20px;
  font-size: 16px;
}
form * {
  box-sizing: border-box;
  line-height: 1.5;
}
.field {
  display: flex;
  flex-direction: column;
}
.field label {
  margin: 4px 0;
  font-weight: bold;
}
.field input,
.field textarea {
  padding: 8px;
  font-size: 18px;
}
.field textarea {
  height: 300px;
}
.actions {
  text-align: right;
  padding: 10px 0;
}
</style>
