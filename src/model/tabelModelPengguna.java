/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelModelPengguna extends AbstractTableModel {
    List<Pengguna> list_pengguna;

    public tabelModelPengguna(List<Pengguna> list_pengguna) {
        this.list_pengguna = list_pengguna;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return list_pengguna.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nama";
            case 2:
                return "Email";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list_pengguna.get(row).getId();
            case 1:
                return list_pengguna.get(row).getNama();
            case 2:
                return list_pengguna.get(row).getEmail();
            default:
                return null;
        }
    }
}

