package br.com.teste.spring_batch.processor;

import org.springframework.batch.item.ItemProcessor;

import br.com.teste.spring_batch.model.ValorRecebido;

public class CustomItemProcessorPares implements ItemProcessor<ValorRecebido, ValorRecebido>{

	public ValorRecebido process(ValorRecebido item) throws Exception {

		System.out.println("Processando: " + item);
		
		if(item.getValor() % 2 == 0) {
			return item;
		} else {		
			return null;
		}
		
	}
	
}
