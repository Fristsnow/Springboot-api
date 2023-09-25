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
                <button class="btn" @click="update(item.id)">update</button>
                <button class="btn" @click="delete(item.id)">Delete</button>
            </td>
        </tr>
    </table>
</div>
<div class="modal" id="update">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Password Reset Success!</h5>
                <button type="button" class="close" onclick="closeModal('#update')">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div>The new password is : </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm" onclick="closeModal('#update')">OK</button>
            </div>
        </div>
    </div>
</div>
`,
    setup() {
        const book = reactive([])
        const active = ref(false)
        const dataForm = reactive({
            email: '',
            book: '',
            name: '',
            plane: ''
        })
        api.get('/book/')
            .then(res => {
                book.push(...res.data.data)
            })
        const methods = {
            create() {
                api.post('/book/create', dataForm)
                    .then(res => {
                        console.log(res.data.message)
                    })
            },
            update(id) {
                api.post('/book/update/' + id)
                    .then(res => {
                        console.log(res.data.message)
                    })
            },
            delete(id) {
                api.post('/book/delete/' + id)
                    .then(res => {
                        console.log(res.data.message)
                    })
            }
        }
        return {
            book,
            ...methods
        }
    },
    mounted() {
        new ClickBtnNav()
    }
}
