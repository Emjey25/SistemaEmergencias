package Clase_08_II.model.observer;

import Clase_08_II.model.Emergencia;

public interface SujetoEmergencias {
    void agregarObserver(ObserverEmergencias observerEmergencias);

    void eliminarObserver(ObserverEmergencias observerEmergencias);

    void notificarEmergencias(Emergencia emergencia);
}
