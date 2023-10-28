As a SuperAdmin, I want to manage message of users, so that I can know how many people use system
{
	Basic Flow {
		(User)1. the SuperAdmin shall login with his identity and password.
		(System)2. if SuperAdmin identity or password is wrong the system shall refuse service.
		(System)3. if SuperAdmin identity is not exist the system shall refuse service.
		(System)4. the system shall show customers and admins message for SuperAdmin.
		(User)5. the SuperAdmin shall edit them message.
		(System) 6. when SuperAdmin submit new message the system shall invoke Check Handle.
		(System) 7. if submit message is not right the system shall refuse service.
	}
}

As a Admin, I want to manage commodity, so that customers can buy goods
{
	Basic Flow {
		(System) 1. if Admin has no authority the system shall refuse service.
		(User) 2. the Admin shall add commodity.
		(User) 3. the Admin shall delete commodity.
		(User) 4. the Admin shall check commodity.
		(User) 5. the Admin shall modify price of commodity.
		(System) 6. if there is no commodity the system shall refuse adding.
		(System) 7. if price is too expensive the system shall refuse modifying price.
		(System) 8. if commodity is over stock the system shall refuse adding.
	}
	Alternative Flow {
		A. At any time, system must verify Admin has login or not :
			1. system must invoke login process because Admin has not login.
			2. system must do nothing because user has login.
	}
}

As a Admin, I want to manage orders, so that I can understand order status
{
	Basic Flow {
		(User) 1. the Admin shall browse orders.
		(User) 2. the Admin shall delete orders.
		(System) 3. if there is no orders the system shall refuse deleting.
		(System) 7. if orders is applyed to refund the system shall feedback to administrator.
		(System) 8. if orders is argeed to be refund the system shall inform customer.
	}
	Alternative Flow {
		A. At any time, system must verify Admin has login or not :
			1. system must invoke login process because Admin has not login.
			2. system must do nothing because user has login.
		B. At any time, system must update order status :
			1. system must delete orders what have been refunded.
			2. system must update type including apply to refund or not apply.
	}
}

As a Customer, I want to manage shopping cart, so that customers can record what them like
{
	Basic Flow { 
		(User) 1. the Customer shall add to cart about goods he like.
		(User) 2. the Customer shall delete goods he dislike from cart.
		(User) 3. the Customer shall browse goods in shopping cart.
		(System) 4. if shopping cart has no goods the system shall refuse deleting.
	}
	Alternative Flow {
		A. At any time, system must verify Admin has login or not :
			1. system must invoke login process because Admin has not login.
			2. system must do nothing because user has login.
		B. At any time, system must calculating goods total price :
			1. system must add price because Customer add goods into shopping cart.
			2. system must delete price because Customer delete goods from shopping cart.
	}
}

As a Customer, I want to apply refund, so that I can buy others
{
	Basic Flow { 
		(User) 1. the Customer shall apply to refund.
		(System) 2. if goods have been used the system shall refuse refunding.
		(System) 3. if goods not delivery the system shall agree refunding.
	}
	Alternative Flow {
		A. At any time, system must verify Admin has login or not :
			1. system must invoke login process because Admin has not login.
			2. system must do nothing because user has login.
	}
}