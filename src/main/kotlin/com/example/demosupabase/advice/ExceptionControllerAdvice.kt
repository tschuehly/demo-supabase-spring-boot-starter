package com.example.demosupabase.advice

import io.supabase.supabasespringbootstarter.exception.*
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerAdvice(
) {
    @ExceptionHandler(InvalidLoginCredentialsException::class)
    fun handleInvalidLoginCredentialsException(exception: InvalidLoginCredentialsException): String {
        return "info :: _(message='Your Login Credentials are invalid')"
    }

    @ExceptionHandler(UserNeedsToConfirmEmailBeforeLoginException::class)
    fun handleUserNeedsToConfirmEmail(): String {
        return "info :: _(message='You need to confirm your email to login')"
    }

    @ExceptionHandler(SuccessfulRegistrationConfirmationEmailSentException::class)
    fun handleSuccessfulRegistration(exception: SuccessfulRegistrationConfirmationEmailSentException): String {
        return "info :: _(message='Your successfully registered, we sent you an email to confirm')"
    }

    @ExceptionHandler(PasswordRecoveryEmailSent::class)
    fun handlePasswordRecoveryEmailSent(exception: Exception): String {
        return "info :: _(message='We sent you a password recovery email')"
    }

    @ExceptionHandler(SuccessfulPasswordUpdate::class)
    fun handleSuccessfulPasswordUpdate(exception: Exception): String {
        return "info :: _(message='Your password was successfully updated')"
    }

}
