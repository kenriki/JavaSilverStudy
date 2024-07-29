package demo.sample2;

import java.time.LocalDate;

import javafx.application.Application;

public abstract class FxBase extends Application{
	protected abstract LocalDate getDate();
	
	protected abstract boolean fileExists() ;
}
