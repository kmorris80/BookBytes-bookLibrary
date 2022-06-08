<template>
    <div id="new-message">
        <h1>Add New Message</h1>
        <form id="input" v-on:submit.prevent="saveMessage">
        <div>
            <input type="text" name="username" placeholder="Username">
        </div>
        <div>
            <input type="text" name="title" placeholder="Title of message">
        </div>
        <div>
            <textarea type="" name="message" placeholder="Message content"/>
        </div>
        <div id="button">
            <button class="btn btn-secondary">Post Message</button>
        </div>
    </form>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>

h1 {
    padding-top: 20px;
    text-align: center;
}

#input {
    padding-left: 460px;
}

div {
    padding-bottom: 10px;
}

textarea {
    width: 370px;
    height: 180px;
}


</style>