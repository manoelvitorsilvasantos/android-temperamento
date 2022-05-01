package br.temperamentos.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.webkit.WebSettings;
import android.support.v7.app.*;
import android.widget.Magnifier.*;
import android.content.*;
import android.text.method.*;
import android.text.*;



public class MainActivity extends AppCompatActivity{
	
	private static final int SOBRE = Menu.FIRST;
	
	public static int random(int range) { 
		return (int)((java.lang.Math.random() * range) + 1);
	}

	public Button somar;
	public Context contexto;
	public double sang, cole, mela, fleu;
	/* Visor */
	public TextView percSang, percCole, percMela, percFleu;
	//* Sangüineo Pontos Fortes*//
	public CheckBox spf1, spf2, spf3, spf4, spf5, spf6, spf7, spf8, spf9, spf10, spf11, spf12, spf13, spf14, spf15, spf16, spf17, spf18, spf19, spf20, spf21, spf22, spf23, spf24, spf25, spf26, spf27, spf28, spf29, spf30; 
	//* Sangüineo Pontos Fracos *//
	public CheckBox spn1, spn2, spn3, spn4, spn5, spn6, spn7, spn8, spn9, spn10, spn11, spn12, spn13, spn14, spn15, spn16, spn17, spn18, spn19, spn20;
	//* Colérico Pontos Fortes *//
	public CheckBox cpf1, cpf2, cpf3, cpf4, cpf5, cpf6, cpf7, cpf8, cpf9, cpf10, cpf11, cpf12, cpf13, cpf14, cpf15, cpf16, cpf17,  cpf18, cpf19, cpf20, cpf21, cpf22, cpf23,  cpf24, cpf25, cpf26, cpf27, cpf28, cpf29, cpf30; 
	//* Colérico pontos Fracos
	public CheckBox cpn1, cpn2, cpn3, cpn4, cpn5, cpn6, cpn7, cpn8, cpn9, cpn10, cpn11, cpn12, cpn13,  cpn14, cpn15,  cpn16,  cpn17,   cpn18, cpn19, cpn20;
	//* Melancólico Pontos Fortes*//
	public CheckBox mpf1, mpf2, mpf3, mpf4, mpf5, mpf6, mpf7, mpf8, mpf9, mpf10, mpf11, mpf12, mpf13, mpf14, mpf15, mpf16, mpf17, mpf18, mpf19, mpf20, mpf21, mpf22, mpf23, mpf24, mpf25, mpf26, mpf27, mpf28, mpf29, mpf30; 
	//* Melancólico Pontos Fracos *//
	public CheckBox mpn1, mpn2, mpn3, mpn4, mpn5, mpn6, mpn7, mpn8, mpn9, mpn10, mpn11, mpn12, mpn13, mpn14, mpn15, mpn16, mpn17, mpn18, mpn19, mpn20;
	//* Fleumático Pontos Fortes *//
	public CheckBox fpf1, fpf2, fpf3, fpf4, fpf5, fpf6, fpf7, fpf8, fpf9, fpf10, fpf11, fpf12, fpf13, fpf14, fpf15, fpf16, fpf17, fpf18, fpf19, fpf20, fpf21, fpf22, fpf23, fpf24, fpf25, fpf26, fpf27, fpf28, fpf29, fpf30; 
	//* Fleumático pontos Fracos
	public CheckBox fpn1, fpn2, fpn3, fpn4, fpn5, fpn6, fpn7, fpn8, fpn9, fpn10, fpn11, fpn12, fpn13, fpn14, fpn15, fpn16, fpn17, fpn18, fpn19, fpn20;
	public MainActivity(){
		super();
	}

	public MainActivity(double sang, double cole, double mela, double fleu){
		this.sang = sang;
		this.cole = cole;
		this.mela = mela;
		this.fleu = fleu;
	}

	@Override
	public void onCreate(Bundle InstanciaTemperamentos){
		super.onCreate(InstanciaTemperamentos);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
		ActionBar action = getSupportActionBar();
		if(action!= null){
			action.setDisplayHomeAsUpEnabled(true);
			action.setHomeButtonEnabled(true);
		}
		getCalcula();
	}

	private void getCalcula(){


		setContentView(R.layout.main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		somar = (Button) findViewById(R.id.calcular);


		contexto = getApplicationContext();

		//Sanguineo

		spf1 = (CheckBox) findViewById(R.id.pfs1);
		spf2 = (CheckBox) findViewById(R.id.pfs2);
		spf3 = (CheckBox) findViewById(R.id.pfs3);
		spf4 = (CheckBox) findViewById(R.id.pfs4);
		spf5 = (CheckBox) findViewById(R.id.pfs5);
		spf6 = (CheckBox) findViewById(R.id.pfs6);
		spf7 = (CheckBox) findViewById(R.id.pfs7);
		spf8 = (CheckBox) findViewById(R.id.pfs8);
		spf9 = (CheckBox) findViewById(R.id.pfs9);
		spf10 = (CheckBox) findViewById(R.id.pfs10);
		spf11 = (CheckBox) findViewById(R.id.pfs11);
		spf12 = (CheckBox) findViewById(R.id.pfs12);
		spf13 = (CheckBox) findViewById(R.id.pfs13);
		spf14 = (CheckBox) findViewById(R.id.pfs14);
		spf15 = (CheckBox) findViewById(R.id.pfs15);
		spf16 = (CheckBox) findViewById(R.id.pfs16);
		spf17 = (CheckBox) findViewById(R.id.pfs17);
		spf18 = (CheckBox) findViewById(R.id.pfs18);
		spf19 = (CheckBox) findViewById(R.id.pfs19);
		spf20 = (CheckBox) findViewById(R.id.pfs20);
		spf21 = (CheckBox) findViewById(R.id.pfs21);
		spf22 = (CheckBox) findViewById(R.id.pfs22);
		spf23 = (CheckBox)findViewById(R.id.pfs23);
		spf24 = (CheckBox)findViewById(R.id.pfs24);
		spf25 = (CheckBox)findViewById(R.id.pfs25);
		spf26 = (CheckBox)findViewById(R.id.pfs26);
		spf27 = (CheckBox)findViewById(R.id.pfs27);
		spf28 = (CheckBox)findViewById(R.id.pfs28);
		spf29 = (CheckBox)findViewById(R.id.pfs29);
		spf30 = (CheckBox)findViewById(R.id.pfs30);
		spn1 = (CheckBox)findViewById(R.id.pns1);
		spn2 = (CheckBox)findViewById(R.id.pns2);
		spn3 = (CheckBox)findViewById(R.id.pns3);
		spn4 = (CheckBox)findViewById(R.id.pns4);
		spn5 = (CheckBox)findViewById(R.id.pns5);
		spn6 = (CheckBox)findViewById(R.id.pns6);
		spn7 = (CheckBox)findViewById(R.id.pns7);
		spn8 = (CheckBox)findViewById(R.id.pns8);
		spn9 = (CheckBox)findViewById(R.id.pns9);
		spn10 = (CheckBox)findViewById(R.id.pns10);
		spn11 = (CheckBox) findViewById(R.id.pns11);
		spn12 = (CheckBox) findViewById(R.id.pns12);
		spn13 = (CheckBox) findViewById(R.id.pns13);
		spn14 = (CheckBox) findViewById(R.id.pns14);
		spn15 = (CheckBox) findViewById(R.id.pns15);
		spn16 = (CheckBox) findViewById(R.id.pns16);
		spn17 = (CheckBox) findViewById(R.id.pns17);
		spn18 = (CheckBox) findViewById(R.id.pns18);
		spn19 = (CheckBox) findViewById(R.id.pns19);
		spn20 = (CheckBox) findViewById(R.id.pns20);
		// colerico
		cpf1 = (CheckBox)findViewById(R.id.pfc1);
		cpf2 = (CheckBox)findViewById(R.id.pfc2);
		cpf3 = (CheckBox)findViewById(R.id.pfc3);
		cpf4 = (CheckBox)findViewById(R.id.pfc4);
		cpf5 = (CheckBox)findViewById(R.id.pfc5);
		cpf6 = (CheckBox)findViewById(R.id.pfc6);
		cpf7 = (CheckBox)findViewById(R.id.pfc7);
		cpf8 = (CheckBox)findViewById(R.id.pfc8);
		cpf9 = (CheckBox)findViewById(R.id.pfc9);
		cpf10 = (CheckBox)findViewById(R.id.pfc10);
		cpf11 = (CheckBox)findViewById(R.id.pfc11);
		cpf12 = (CheckBox)findViewById(R.id.pfc12);
		cpf13 = (CheckBox)findViewById(R.id.pfc13);
		cpf14 = (CheckBox)findViewById(R.id.pfc14);
		cpf15 = (CheckBox)findViewById(R.id.pfc15);
		cpf16 = (CheckBox)findViewById(R.id.pfc16);
		cpf17 = (CheckBox)findViewById(R.id.pfc17);
		cpf18 = (CheckBox)findViewById(R.id.pfc18);
		cpf19 = (CheckBox)findViewById(R.id.pfc19);
		cpf20 = (CheckBox)findViewById(R.id.pfc20);
		cpf21 = (CheckBox)findViewById(R.id.pfc21);
		cpf22 = (CheckBox)findViewById(R.id.pfc22);
		cpf23 = (CheckBox)findViewById(R.id.pfc23);
		cpf24 = (CheckBox)findViewById(R.id.pfc24);
		cpf25 = (CheckBox)findViewById(R.id.pfc25);
		cpf26 = (CheckBox)findViewById(R.id.pfc26);
		cpf27 = (CheckBox)findViewById(R.id.pfc27);
		cpf28 = (CheckBox)findViewById(R.id.pfc28);
		cpf29 = (CheckBox)findViewById(R.id.pfc29);
		cpf30 = (CheckBox)findViewById(R.id.pfc30);
		cpn1 = (CheckBox)findViewById(R.id.pnc1);
		cpn2 = (CheckBox)findViewById(R.id.pnc2);
		cpn3 = (CheckBox)findViewById(R.id.pnc3);
		cpn4 = (CheckBox)findViewById(R.id.pnc4);
		cpn5 = (CheckBox)findViewById(R.id.pnc5);
		cpn6 = (CheckBox)findViewById(R.id.pnc6);
		cpn7 = (CheckBox)findViewById(R.id.pnc7);
		cpn8 = (CheckBox)findViewById(R.id.pnc8);
		cpn9 = (CheckBox)findViewById(R.id.pnc9);
		cpn10 = (CheckBox)findViewById(R.id.pnc10);
		cpn11 = (CheckBox)findViewById(R.id.pnc11);
		cpn12 = (CheckBox)findViewById(R.id.pnc12);
		cpn13 = (CheckBox)findViewById(R.id.pnc13);
		cpn14 = (CheckBox)findViewById(R.id.pnc14);
		cpn15 = (CheckBox)findViewById(R.id.pnc15);
		cpn16 = (CheckBox)findViewById(R.id.pnc16);
		cpn17 = (CheckBox)findViewById(R.id.pnc17);
		cpn18 = (CheckBox)findViewById(R.id.pnc18);
		cpn19 = (CheckBox)findViewById(R.id.pnc19);
		cpn20 = (CheckBox)findViewById(R.id.pnc20);


		//Melancolico
		mpf1 = (CheckBox)findViewById(R.id.pfm1);
		mpf2 = (CheckBox)findViewById(R.id.pfm2);
		mpf3 = (CheckBox)findViewById(R.id.pfm3);
		mpf4 = (CheckBox)findViewById(R.id.pfm4);
		mpf5 = (CheckBox)findViewById(R.id.pfm5);
		mpf6 = (CheckBox)findViewById(R.id.pfm6);
		mpf7 = (CheckBox)findViewById(R.id.pfm7);
		mpf8 = (CheckBox)findViewById(R.id.pfm8);
		mpf9 = (CheckBox)findViewById(R.id.pfm9);
		mpf10 = (CheckBox)findViewById(R.id.pfm10);
		mpf11 = (CheckBox)findViewById(R.id.pfm11);
		mpf12 = (CheckBox)findViewById(R.id.pfm12);
		mpf13 = (CheckBox)findViewById(R.id.pfm13);
		mpf14 = (CheckBox)findViewById(R.id.pfm14);
		mpf15 = (CheckBox)findViewById(R.id.pfm15);
		mpf16 = (CheckBox)findViewById(R.id.pfm16);
		mpf17 = (CheckBox)findViewById(R.id.pfm17);
		mpf18 = (CheckBox)findViewById(R.id.pfm18);
		mpf19 = (CheckBox)findViewById(R.id.pfm19);
		mpf20 = (CheckBox)findViewById(R.id.pfm20);
		mpf21 = (CheckBox)findViewById(R.id.pfm21);
		mpf22 = (CheckBox)findViewById(R.id.pfm22);
		mpf23 = (CheckBox)findViewById(R.id.pfm23);
		mpf24 = (CheckBox)findViewById(R.id.pfm24);
		mpf25 = (CheckBox)findViewById(R.id.pfm25);
		mpf26 = (CheckBox)findViewById(R.id.pfm26);
		mpf27 = (CheckBox)findViewById(R.id.pfm27);
		mpf28 = (CheckBox)findViewById(R.id.pfm28);
		mpf29 = (CheckBox)findViewById(R.id.pfm29);
		mpf30 = (CheckBox)findViewById(R.id.pfm30);
		mpn1 = (CheckBox)findViewById(R.id.pnm1);
		mpn2 = (CheckBox)findViewById(R.id.pnm2);
		mpn3 = (CheckBox)findViewById(R.id.pnm3);
		mpn4 = (CheckBox)findViewById(R.id.pnm4);
		mpn5 = (CheckBox)findViewById(R.id.pnm5);
		mpn6 = (CheckBox)findViewById(R.id.pnm6);
		mpn7 = (CheckBox)findViewById(R.id.pnm7);
		mpn8 = (CheckBox)findViewById(R.id.pnm8);
		mpn9 = (CheckBox)findViewById(R.id.pnm9);
		mpn10 = (CheckBox)findViewById(R.id.pnm10);
		mpn11 = (CheckBox)findViewById(R.id.pnm11);
		mpn12 = (CheckBox)findViewById(R.id.pnm12);
		mpn13 = (CheckBox)findViewById(R.id.pnm13);
		mpn14 = (CheckBox)findViewById(R.id.pnm14);
		mpn15 = (CheckBox)findViewById(R.id.pnm15);
		mpn16 = (CheckBox)findViewById(R.id.pnm16);
		mpn17 = (CheckBox)findViewById(R.id.pnm17);
		mpn18 = (CheckBox)findViewById(R.id.pnm18);
		mpn19 = (CheckBox)findViewById(R.id.pnm19);
		mpn20 = (CheckBox)findViewById(R.id.pnm20);


		//Fleumatico

		fpf1 = (CheckBox)findViewById(R.id.pff1);
		fpf2 = (CheckBox)findViewById(R.id.pff2);
		fpf3 = (CheckBox)findViewById(R.id.pff3);
		fpf4 = (CheckBox)findViewById(R.id.pff4);
		fpf5 = (CheckBox)findViewById(R.id.pff5);
		fpf6 = (CheckBox)findViewById(R.id.pff6);
		fpf7 = (CheckBox)findViewById(R.id.pff7);
		fpf8 = (CheckBox)findViewById(R.id.pff8);
		fpf9 = (CheckBox)findViewById(R.id.pff9);
		fpf10 = (CheckBox)findViewById(R.id.pff10);
		fpf11 = (CheckBox)findViewById(R.id.pff11);
		fpf12 = (CheckBox)findViewById(R.id.pff12);
		fpf13 = (CheckBox)findViewById(R.id.pff13);
		fpf14 = (CheckBox)findViewById(R.id.pff14);
		fpf15 = (CheckBox)findViewById(R.id.pff15);
		fpf16 = (CheckBox)findViewById(R.id.pff16);
		fpf17 = (CheckBox)findViewById(R.id.pff17);
		fpf18 = (CheckBox)findViewById(R.id.pff18);
		fpf19 = (CheckBox)findViewById(R.id.pff19);
		fpf20 = (CheckBox)findViewById(R.id.pff20);
		fpf21 = (CheckBox)findViewById(R.id.pff21);
		fpf22 = (CheckBox)findViewById(R.id.pff22);
		fpf23 = (CheckBox)findViewById(R.id.pff23);
		fpf24 = (CheckBox)findViewById(R.id.pff24);
		fpf25 = (CheckBox)findViewById(R.id.pff25);
		fpf26 = (CheckBox)findViewById(R.id.pff26);
		fpf27 = (CheckBox)findViewById(R.id.pff27);
		fpf28 = (CheckBox)findViewById(R.id.pff28);
		fpf29 = (CheckBox)findViewById(R.id.pff29);
		fpf30 = (CheckBox)findViewById(R.id.pff30);
		fpn1 = (CheckBox)findViewById(R.id.pnf1);
		fpn2 = (CheckBox)findViewById(R.id.pnf2);
		fpn3 = (CheckBox)findViewById(R.id.pnf3);
		fpn4 = (CheckBox)findViewById(R.id.pnf4);
		fpn5 = (CheckBox)findViewById(R.id.pnf5);
		fpn6 = (CheckBox)findViewById(R.id.pnf6);
		fpn7 = (CheckBox)findViewById(R.id.pnf7);
		fpn8 = (CheckBox)findViewById(R.id.pnf8);
		fpn9 = (CheckBox)findViewById(R.id.pnf9);
		fpn10 = (CheckBox)findViewById(R.id.pnf10);
		fpn11 = (CheckBox)findViewById(R.id.pnf11);
		fpn12 = (CheckBox)findViewById(R.id.pnf12);
		fpn13 = (CheckBox)findViewById(R.id.pnf13);
		fpn14 = (CheckBox)findViewById(R.id.pnf14);
		fpn15 = (CheckBox)findViewById(R.id.pnf15);
		fpn16 = (CheckBox)findViewById(R.id.pnf16);
		fpn17 = (CheckBox)findViewById(R.id.pnf17);
		fpn18 = (CheckBox)findViewById(R.id.pnf18);
		fpn19 = (CheckBox)findViewById(R.id.pnf19);
		fpn20 = (CheckBox)findViewById(R.id.pnf20);

		somar.setOnClickListener(new Button.OnClickListener(){

				public void onClick(View p1)
				{
					// TODO: Implement this method
					double sanguineo = 0;
					double colerico = 0;
					double melancolico = 0;
					double fleumatico = 0;


					if(spf1.isChecked()){
						sanguineo++;

					}
					if(spf2.isChecked()){
						sanguineo++;

					}
					if(spf3.isChecked()){
						sanguineo++;

					}
					if(spf4.isChecked()){
						sanguineo++;

					}
					if(spf4.isChecked()){
						sanguineo++;

					}

					if(spf6.isChecked()){
						sanguineo++;

					}
					if(spf7.isChecked()){
						sanguineo++;

					}
					if(spf8.isChecked()){
						sanguineo++;

					}
					if(spf9.isChecked()){
						sanguineo++;

					}
					if(spf10.isChecked()){
						sanguineo++;

					}


					if(spf11.isChecked()){
						sanguineo++;

					}
					if(spf12.isChecked()){
						sanguineo++;

					}
					if(spf13.isChecked()){
						sanguineo++;

					}
					if(spf14.isChecked()){
						sanguineo++;

					}
					if(spf15.isChecked()){
						sanguineo++;

					}

					if(spf16.isChecked()){
						sanguineo++;

					}
					if(spf17.isChecked()){
						sanguineo++;

					}
					if(spf18.isChecked()){
						sanguineo++;

					}
					if(spf19.isChecked()){
						sanguineo++;

					}
					if(spf20.isChecked()){
						sanguineo++;

					}

					if(spf21.isChecked()){
						sanguineo++;

					}
					if(spf22.isChecked()){
						sanguineo++;

					}
					if(spf23.isChecked()){
						sanguineo++;

					}
					if(spf24.isChecked()){
						sanguineo++;

					}
					if(spf25.isChecked()){
						sanguineo++;

					}

					if(spf26.isChecked()){
						sanguineo++;

					}
					if(spf27.isChecked()){
						sanguineo++;

					}
					if(spf28.isChecked()){
						sanguineo++;

					}
					if(spf29.isChecked()){
						sanguineo++;

					}
					if(spf30.isChecked()){
						sanguineo++;

					}
					if(spn1.isChecked()){

						sanguineo++;
					}
					if(spn2.isChecked()){

						sanguineo++;
					}

					if(spn3.isChecked()){

						sanguineo++;
					}
					if(spn4.isChecked()){

						sanguineo++;
					}
					if(spn5.isChecked()){

						sanguineo++;
					}

					if(spn6.isChecked()){

						sanguineo++;
					}
					if(spn7.isChecked()){

						sanguineo++;
					}
					if(spn8.isChecked()){

						sanguineo++;
					}
					if(spn9.isChecked()){

						sanguineo++;
					}

					if(spn10.isChecked()){

						sanguineo++;
					}

					if(spn11.isChecked()){

						sanguineo++;
					}
					if(spn12.isChecked()){

						sanguineo++;
					}

					if(spn13.isChecked()){

						sanguineo++;
					}
					if(spn14.isChecked()){

						sanguineo++;
					}
					if(spn15.isChecked()){

						sanguineo++;
					}

					if(spn16.isChecked()){

						sanguineo++;
					}
					if(spn17.isChecked()){

						sanguineo++;
					}
					if(spn18.isChecked()){

						sanguineo++;
					}
					if(spn19.isChecked()){

						sanguineo++;
					}

					if(spn20.isChecked()){

						sanguineo++;
					}

					if(cpf1.isChecked()){
						colerico++;
					}
					if(cpf2.isChecked()){
						colerico++;
					}
					if(cpf3.isChecked()){
						colerico++;
					}
					if(cpf4.isChecked()){
						colerico++;
					}
					if(cpf5.isChecked()){
						colerico++;
					}
					if(cpf6.isChecked()){
						colerico++;
					}
					if(cpf7.isChecked()){
						colerico++;
					}
					if(cpf8.isChecked()){
						colerico++;
					}
					if(cpf9.isChecked()){
						colerico++;
					}
					if(cpf10.isChecked()){
						colerico++;
					}
					if(cpf11.isChecked()){
						colerico++;
					}
					if(cpf12.isChecked()){
						colerico++;
					}
					if(cpf13.isChecked()){
						colerico++;
					}
					if(cpf14.isChecked()){
						colerico++;
					}
					if(cpf15.isChecked()){
						colerico++;
					}
					if(cpf16.isChecked()){
						colerico++;
					}
					if(cpf17.isChecked()){
						colerico++;
					}

					if(cpf18.isChecked()){
						colerico++;
					}
					if(cpf19.isChecked()){
						colerico++;
					}
					if(cpf20.isChecked()){
						colerico++;
					}
					if(cpf21.isChecked()){
						colerico++;
					}
					if(cpf22.isChecked()){
						colerico++;
					}
					if(cpf23.isChecked()){
						colerico++;
					}
					if(cpf24.isChecked()){
						colerico++;
					}

					if(cpf25.isChecked()){
						colerico++;
					}
					if(cpf26.isChecked()){
						colerico++;
					}
					if(cpf27.isChecked()){
						colerico++;
					}
					if(cpf28.isChecked()){
						colerico++;
					}
					if(cpf29.isChecked()){
						colerico++;
					}
					if(cpf30.isChecked()){
						colerico++;
					}



					if(cpn1.isChecked()){

						colerico++;
					}
					if(cpn2.isChecked()){

						colerico++;
					}
					if(cpn3.isChecked()){

						colerico++;
					}
					if(cpn4.isChecked()){

						colerico++;
					}
					if(cpn5.isChecked()){

						colerico++;
					}
					if(cpn6.isChecked()){

						colerico++;
					}
					if(cpn7.isChecked()){

						colerico++;
					}
					if(cpn8.isChecked()){

						colerico++;
					}
					if(cpn9.isChecked()){

						colerico++;
					}
					if(cpn10.isChecked()){

						colerico++;
					}
					if(cpn11.isChecked()){

						colerico++;
					}
					if(cpn12.isChecked()){

						colerico++;
					}
					if(cpn13.isChecked()){

						colerico++;
					}
					if(cpn14.isChecked()){

						colerico++;
					}
					if(cpn15.isChecked()){

						colerico++;
					}
					if(cpn16.isChecked()){

						colerico++;
					}
					if(cpn17.isChecked()){

						colerico++;
					}
					if(cpn18.isChecked()){

						colerico++;
					}
					if(cpn19.isChecked()){

						colerico++;
					}
					if(cpn20.isChecked()){

						colerico++;
					}


					if(mpf1.isChecked()){
						melancolico++;
					}
					if(mpf2.isChecked()){
						melancolico++;
					}
					if(mpf3.isChecked()){
						melancolico++;
					}
					if(mpf4.isChecked()){
						melancolico++;
					}
					if(mpf5.isChecked()){
						melancolico++;
					}
					if(mpf6.isChecked()){
						melancolico++;
					}
					if(mpf7.isChecked()){
						melancolico++;
					}
					if(mpf8.isChecked()){
						melancolico++;
					}
					if(mpf9.isChecked()){
						melancolico++;
					}
					if(mpf10.isChecked()){
						melancolico++;
					}
					if(mpf11.isChecked()){
						melancolico++;
					}
					if(mpf12.isChecked()){
						melancolico++;
					}
					if(mpf13.isChecked()){
						melancolico++;
					}
					if(mpf14.isChecked()){
						melancolico++;
					}
					if(mpf15.isChecked()){
						melancolico++;
					}
					if(mpf16.isChecked()){
						melancolico++;
					}
					if(mpf17.isChecked()){
						melancolico++;
					}
					if(mpf18.isChecked()){
						melancolico++;
					}
					if(mpf19.isChecked()){
						melancolico++;
					}
					if(mpf20.isChecked()){
						melancolico++;
					}
					if(mpf21.isChecked()){
						melancolico++;
					}
					if(mpf22.isChecked()){
						melancolico++;
					}
					if(mpf23.isChecked()){
						melancolico++;
					}
					if(mpf24.isChecked()){
						melancolico++;
					}
					if(mpf25.isChecked()){
						melancolico++;
					}
					if(mpf26.isChecked()){
						melancolico++;
					}
					if(mpf27.isChecked()){
						melancolico++;
					}
					if(mpf28.isChecked()){
						melancolico++;
					}
					if(mpf29.isChecked()){
						melancolico++;
					}
					if(mpf30.isChecked()){
						melancolico++;
					}

					if(mpn1.isChecked()){
						melancolico++;
					}
					if(mpn2.isChecked()){
						melancolico++;
					}

					if(mpn3.isChecked()){
						melancolico++;
					}
					if(mpn4.isChecked()){
						melancolico++;
					}
					if(mpn5.isChecked()){
						melancolico++;
					}
					if(mpn6.isChecked()){
						melancolico++;
					}
					if(mpn7.isChecked()){
						melancolico++;
					}
					if(mpn8.isChecked()){
						melancolico++;
					}
					if(mpn9.isChecked()){
						melancolico++;
					}
					if(mpn10.isChecked()){
						melancolico++;
					}
					if(mpn11.isChecked()){
						melancolico++;
					}
					if(mpn12.isChecked()){
						melancolico++;
					}

					if(mpn13.isChecked()){
						melancolico++;
					}
					if(mpn14.isChecked()){
						melancolico++;
					}
					if(mpn15.isChecked()){
						melancolico++;
					}
					if(mpn16.isChecked()){
						melancolico++;
					}
					if(mpn17.isChecked()){
						melancolico++;
					}
					if(mpn18.isChecked()){
						melancolico++;
					}
					if(mpn19.isChecked()){
						melancolico++;
					}
					if(mpn20.isChecked()){
						melancolico++;
					}


					//

					if(fpf1.isChecked()){
						fleumatico++;
					}
					if(fpf2.isChecked()){
						fleumatico++;
					}
					if(fpf3.isChecked()){
						fleumatico++;
					}
					if(fpf4.isChecked()){
						fleumatico++;
					}
					if(fpf5.isChecked()){
						fleumatico++;
					}
					if(fpf6.isChecked()){
						fleumatico++;
					}
					if(fpf7.isChecked()){
						fleumatico++;
					}
					if(fpf8.isChecked()){
						fleumatico++;
					}
					if(fpf9.isChecked()){
						fleumatico++;
					}
					if(fpf10.isChecked()){
						fleumatico++;
					}
					if(fpf11.isChecked()){
						fleumatico++;
					}
					if(fpf12.isChecked()){
						fleumatico++;
					}
					if(fpf13.isChecked()){
						fleumatico++;
					}
					if(fpf14.isChecked()){
						fleumatico++;
					}
					if(fpf15.isChecked()){
						fleumatico++;
					}
					if(fpf16.isChecked()){
						fleumatico++;
					}
					if(fpf17.isChecked()){
						fleumatico++;
					}
					if(fpf18.isChecked()){
						fleumatico++;
					}
					if(fpf19.isChecked()){
						fleumatico++;
					}
					if(fpf20.isChecked()){
						fleumatico++;
					}
					if(fpf21.isChecked()){
						fleumatico++;
					}
					if(fpf22.isChecked()){
						fleumatico++;
					}
					if(fpf23.isChecked()){
						fleumatico++;
					}
					if(fpf24.isChecked()){
						fleumatico++;
					}
					if(fpf25.isChecked()){
						fleumatico++;
					}
					if(fpf26.isChecked()){
						fleumatico++;
					}
					if(fpf27.isChecked()){
						fleumatico++;
					}
					if(fpf28.isChecked()){
						fleumatico++;
					}
					if(fpf29.isChecked()){
						fleumatico++;
					}
					if(fpf30.isChecked()){
						fleumatico++;
					}

					if(fpn1.isChecked()){
						fleumatico++;
					}
					if(fpn2.isChecked()){
						fleumatico++;
					}

					if(fpn3.isChecked()){
						fleumatico++;
					}
					if(fpn4.isChecked()){
						fleumatico++;
					}
					if(fpn5.isChecked()){
						fleumatico++;
					}
					if(fpn6.isChecked()){
						fleumatico++;
					}
					if(fpn7.isChecked()){
						fleumatico++;
					}
					if(fpn8.isChecked()){
						fleumatico++;
					}
					if(fpn9.isChecked()){
						fleumatico++;
					}
					if(fpn10.isChecked()){
						fleumatico++;
					}
					if(fpn11.isChecked()){
						fleumatico++;
					}
					if(fpn12.isChecked()){
						fleumatico++;
					}

					if(fpn13.isChecked()){
						fleumatico++;
					}
					if(fpn14.isChecked()){
						fleumatico++;
					}
					if(fpn15.isChecked()){
						fleumatico++;
					}
					if(fpn16.isChecked()){
						fleumatico++;
					}
					if(fpn17.isChecked()){
						fleumatico++;
					}
					if(fpn18.isChecked()){
						fleumatico++;
					}
					if(fpn19.isChecked()){
						fleumatico++;
					}
					if(fpn20.isChecked()){
						fleumatico++;
					}

					double total = sanguineo+colerico+melancolico+fleumatico;
					sang = (sanguineo/total)*100;
					cole = (colerico/total)*100;
					mela = (melancolico/total)*100;
					fleu = (fleumatico/total)*100;




					ResultadoTeste();

	

				}

				public void ResultadoTeste()
				{
					// TODO: Implement this method



					setContentView(R.layout.txt);

					TextView sangue =  (TextView) findViewById(R.id.textoSang);
					TextView fluido_amarelo = (TextView)findViewById(R.id.textoCole);
					TextView fluido_negro = (TextView)findViewById(R.id.textoMela);
					TextView fleuma =  (TextView)findViewById(R.id.textoFleu);
					Button  voltar = (Button) findViewById(R.id.calcular);

					//
					Math.round(sang);
					sangue.setText("Sangüineo :"+String.valueOf(Math.round(sang))+"%");
					fluido_amarelo.setText("Colérico :"+String.valueOf(Math.round(cole))+"%");
					fluido_negro.setText("Melancólico :"+String.valueOf(Math.round(mela))+"%");
					fleuma.setText("Fleumático :"+String.valueOf(Math.round(fleu))+"%");
					
				}
			});
	}
	public void s(View v){
		setContentView(R.layout.about);
		TextView title = (TextView) findViewById(R.id.txtSobre);
		TextView message = (TextView) findViewById(R.id.txtTexto);
		Button btn_about = (Button) findViewById(R.id.btn_about);
		title.setText("Sanguineo");
		message.setText(Html.fromHtml(getResources().getString(R.string.sanguineo_html)));
		message.setMovementMethod(LinkMovementMethod.getInstance());	
	}
	public void c(View v){
		setContentView(R.layout.about);
		TextView title = (TextView) findViewById(R.id.txtSobre);
		TextView message = (TextView) findViewById(R.id.txtTexto);
		Button btn_about = (Button) findViewById(R.id.btn_about);
		title.setText("Colérico");
		message.setText(Html.fromHtml(getResources().getString(R.string.colerico_html)));
		message.setMovementMethod(LinkMovementMethod.getInstance());	
	}
	public void m(View v){
		setContentView(R.layout.about);
		TextView title = (TextView) findViewById(R.id.txtSobre);
		TextView message = (TextView) findViewById(R.id.txtTexto);
		Button btn_about = (Button) findViewById(R.id.btn_about);
		title.setText("Melancólico");
		message.setText(Html.fromHtml(getResources().getString(R.string.melancolico_html)));
		message.setMovementMethod(LinkMovementMethod.getInstance());	
	}
	public void f(View v){
		setContentView(R.layout.about);
		TextView title = (TextView) findViewById(R.id.txtSobre);
		TextView message = (TextView) findViewById(R.id.txtTexto);
		Button btn_about = (Button) findViewById(R.id.btn_about);
		title.setText("Fleumático");
		message.setText(Html.fromHtml(getResources().getString(R.string.fleumatico_html)));
		message.setMovementMethod(LinkMovementMethod.getInstance());	
	}

	
	public void voltar(View v){
		getCalcula();
	}
	
	public void voltar_sobre(View v)
	{
		getCalcula();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu, menu);
		// TODO: Implement this method
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		int id = item.getItemId();
		switch(id){
			case android.R.id.home:
				getCalcula();
				break;
			case R.id.sobre:
				/*String[] texto = {
					"Manoel Vitor",
					"Copyright All Right to Mvictor10"
				};
				AlertDialog.Builder alerta = new AlertDialog.Builder(this);
				alerta.setTitle("Create by");
				alerta.setMessage(texto[0]+"\n"+"\n"+texto[1]).setCancelable(true);
				AlertDialog alert = alerta.create();
				alert.show();
				*/
				about();
				
				break;
		}
		
		// TODO: Implement this method
		return super.onOptionsItemSelected(item);
	}

	private void about()
	{
		// TODO: Implement this method
		setContentView(R.layout.about);
		TextView title = (TextView) findViewById(R.id.txtSobre);
		TextView message = (TextView) findViewById(R.id.txtTexto);
		Button btn_about = (Button) findViewById(R.id.btn_about);
		
		String msg = "Desenvolvido por Manoel Vitor\n\n";
			msg+= "";
		title.setText("Creditos");
		message.setText(Html.fromHtml(getResources().getString(R.string.page_html)));
		message.setMovementMethod(LinkMovementMethod.getInstance());
		

		
	}

	
	







}
