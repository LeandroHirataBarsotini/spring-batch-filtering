package br.com.teste.spring_batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import br.com.teste.spring_batch.model.ValorRecebido;

public class ValorFieldSetMapper implements FieldSetMapper<ValorRecebido> {
	
	public ValorRecebido mapFieldSet(FieldSet fieldSet) throws BindException {

		ValorRecebido v = new ValorRecebido();
		v.setValor(fieldSet.readInt(0));
		
		return v;

	}

}
