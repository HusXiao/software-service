import Vue from 'vue'
import VueRouter from 'vue-router'
//import HomeView from '../views/HomeView.vue'
import Index from '../views/Index.vue'
import BusinessList from '../views/business/BusinessList.vue'
import BusinessInfo from '../views/business/BusinessInfo.vue'
import Login from '../views/user/Login.vue'
import Orders from '../views/order/Orders.vue'
import UserAddress from '../views/user/UserAddress.vue'
import Payment from '../views/order/Payment.vue'
import OrderList from '../views/order/OrderList.vue'
import AddUserAddress from '../views/user/AddUserAddress.vue'
import EditUserAddress from '../views/user/EditUserAddress.vue'
import Register from '../views/user/Register.vue'
import Mine from '../views/user/Mine.vue'
import PaymentResult from '../views/order/PaymentResult.vue'
import Error403 from '../components/Error403.vue'

Vue.use(VueRouter)

const routes = [{
		path: '/',
		name: 'home',
		component: Index
	},
	{
		path: '/index',
		name: 'Index',
		component: Index
	},
	{
		path: '/businessList',
		name: 'BusinessList',
		component: BusinessList
	},
	{
		path: '/businessInfo',
		name: 'BusinessInfo',
		component: BusinessInfo
	},
	{
		path: '/login',
		name: 'Login',
		component: Login
	},
	{
		path: '/orders',
		name: 'Orders',
		component: Orders
	},
	{
		path: '/userAddress',
		name: 'UserAddress',
		component: UserAddress
	}, 
	{
		path: '/payment',
		name: 'Payment',
		component: Payment
	}, 
	{
		path: '/orderList',
		name: 'OrderList',
		component: OrderList
	}, 
	{
		path: '/addUserAddress',
		name: 'AddUserAddress',
		component: AddUserAddress
	}, 
	{
		path: '/editUserAddress',
		name: 'EditUserAddress',
		component: EditUserAddress
	}, 
	{
		path: '/register',
		name: 'Register',
		component: Register
	},
	{
		path: '/mine',
		name: 'Mine',
		component: Mine
	},
	{
		path: '/paymentResult',
		name: 'PaymentResult',
		component: PaymentResult
	},
	{
		path: '/error403',
		name: 'Error403',
		component: Error403
	}
]

// 解决重复路由报异常问题
const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

const router = new VueRouter({
	// mode: 'history',
	base: process.env.BASE_URL,
	routes
})

export default router
