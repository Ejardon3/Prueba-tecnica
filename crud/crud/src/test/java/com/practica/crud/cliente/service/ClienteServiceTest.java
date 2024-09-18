package com.practica.crud.cliente.service;

import com.practica.crud.cliente.model.Cliente;
import com.practica.crud.cliente.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClienteServiceTest {

    @MockBean
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @Test
    public void testAgregarCliente() {
        // Crear un cliente de prueba
        Cliente cliente = new Cliente();
        cliente.setNombre("Test Cliente");
        cliente.setEmail("test@example.com");
        cliente.setTelefono("999999999");

        // Simular la operación de guardar con Mockito
        Mockito.when(clienteRepository.save(cliente)).thenReturn(cliente);

        // Llamar al servicio y verificar el resultado
        Cliente resultado = clienteService.agregarCliente(cliente);
        assertEquals("Test Cliente", resultado.getNombre());
    }
}