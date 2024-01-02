/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelModelSoal extends AbstractTableModel {
    List<Soal> list_soal;

    public tabelModelSoal(List<Soal> list_soal) {
        this.list_soal = list_soal;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return list_soal.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Pertanyaan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list_soal.get(row).getId();
            case 1:
                return list_soal.get(row).getPertanyaan();
            default:
                return null;
        }
    }
}
