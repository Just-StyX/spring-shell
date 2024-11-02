package jsl.group.spring_shell.events;

public record CustomMessage(
        String message,
        NewProductEvent newProductEvent
) {
}
