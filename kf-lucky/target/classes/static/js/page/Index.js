import ClickBtnNav from "../ClickBtnNav.js";

const {reactive, ref} = Vue

export default {
    template: `
    <div class='button'>
    <div class='fa fa-bars'>×</div>
</div>
<div class='menu'>
    <nav>
        <ul>
            <li>
                <a href='home_is_visible'>Home</a>
            </li>
            <li>
                <a href='aboutus_is_visible'>About</a>
            </li>
            <li>
                <a href='clients_is_visible'>Clients</a>
            </li>
            <li>
                <a href='contactus_is_visible'>Contact Us</a>
            </li>
            <li>
                <a href='firstsnow_is_visible'>Firstsnow</a>
            </li>
        </ul>
    </nav>
</div>
<div class='content home'>
    <h1>OffCanvas Nav</h1>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
</div>
<div class='content aboutus'>
    <h1>About Us</h1>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
</div>
<div class='content clients'>
    <h1>Clients</h1>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
</div>
<div class='content contactus'>
    <h1>Contact Us</h1>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum
        tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
        semper. Aenean ultricies mi vitae est. Mauris placerat eleifend %leo</p>
</div>
<div class='content firstsnow firstsnow-table'>
    <h1>Firstsnow</h1>
     <div class="firstsnow-form" id="update">
        <form @submit.prevent="createBook">
            <input type="text" placeholder="book" v-model="dataForm.book">
            <input type="text" placeholder="name" v-model="dataForm.name">
            <input type="text" placeholder="plane" v-model="dataForm.plane">
            <input type="submit" value="createBook">
        </form>
    </div>
    <table>
        <tr>
            <td>Book Number</td>
            <td>book</td>
            <td>name</td>
            <td>plane</td>
        </tr>
        <tr v-for="(item,index) in book" :key="index">
            <td>{{item.id}}</td>
            <td>{{item.book}}</td>
            <td>{{item.name}}</td>
            <td>{{item.plane}}</td>
            <td>
                <button class="btn" @click="updateBook(item.id)">update</button>
                <button class="btn" @click="deleteBook(item.id)">Delete</button>
            </td>
        </tr>
    </table>
   
</div>

`,
    setup() {
        const book = reactive([])
        const active = ref(false)
        const dataForm = reactive({
            book: '',
            name: '',
            plane: ''
        })
        api.get('/book/')
            .then(res => {
                book.push(...res.data.data)
            })
        const methods = {
            createBook() {
                api.post('/book/create', dataForm)
                    .then(res => {
                        alert(res.data.message)
                        book.length = 0
                        api.get('/book/')
                            .then(res => {
                                book.push(...res.data.data)
                            })
                    })
            },
            updateBook(id) {
                api.post('/book/update/' + id)
                    .then(res => {
                        console.log(res.data.message)
                    })
            },
            deleteBook(id) {
                console.log('ok')
                api.post('/book/delete/' + id)
                    .then(res => {
                        alert(res.data.message)
                        book.length = 0
                        api.get('/book/')
                            .then(res => {
                                book.push(...res.data.data)
                            })
                    })
            }
        }
        return {
            book,
            dataForm,
            ...methods
        }
    },
    mounted() {
        new ClickBtnNav()
    }
}
