package br.net.tenentibus

class Apartamento {
	
	String apartamento
	String toString(){apartamento}
	

	static hasmany = [morador:Morador]
	
	static belongsTo = [Morador]
	
    static constraints = {
		
		apartamento nullable:false, blank:false
		
    }
}
 	