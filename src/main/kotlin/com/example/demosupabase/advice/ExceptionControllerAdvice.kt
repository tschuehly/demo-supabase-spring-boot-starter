package com.example.demosupabase.advice

import io.supabase.supabasespringbootstarter.exception.*
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerAdvice(
) {
    @ExceptionHandler(InvalidLoginCredentialsException::class)
    fun handleInvalidLoginCredentialsException(exception: InvalidLoginCredentialsException): String {
        return "account/login :: invalid-login-credentials"
    }

    @ExceptionHandler(UserNeedsToConfirmEmailBeforeLoginException::class)
    fun handleUserNeedsToConfirmEmail(): String {
        return "account/login :: confirmation-needed-before-login"
    }

    @ExceptionHandler(SuccessfulRegistrationConfirmationEmailSentException::class)
    fun handleSuccessfulRegistration(exception: SuccessfulRegistrationConfirmationEmailSentException): String {
        return "account/register :: email-confirmation-needed"
    }

    @ExceptionHandler(PasswordRecoveryEmailSent::class)
    fun handlePasswordRecoveryEmailSent(exception: Exception): String {
        return "account/reset-password :: confirmation-needed-before-password-reset"
    }

    @ExceptionHandler(SuccessfulPasswordUpdate::class)
    fun handleSuccessfulPasswordUpdate(exception: Exception): String {
        return "account/reset-password :: successful-password-update"
    }

}
