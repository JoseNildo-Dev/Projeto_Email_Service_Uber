package br.com.josenildo.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
