package ninja.saad.palaocorona.data.authentication

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import ninja.saad.palaocorona.data.authentication.model.User

interface AuthenticationRepository {
    
    fun sendOtp(phoneNumber: String): Single<String>
    fun verifyOtp(verificationId: String, otp: String): Maybe<User>
    fun saveProfile(name: String, age: String, gender: Int, phoneNumber: String): Completable
}