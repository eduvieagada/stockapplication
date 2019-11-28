var app = new Vue({
    el: '#app',
    data() {
        return {
            message: 'hello world',
            stocks: [],
            title: "Stock Application"
        }
    },
    mounted() {
        axios.get("/api/stocks")
            .then(response => {
                this.message = response.data;
                this.stocks = [...response.data];
            })
            .catch(err => {
                console.error(err);
            });
    }
});