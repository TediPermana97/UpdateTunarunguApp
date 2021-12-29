package com.mfizaralfian.belajartunarungufizarapp.Model;

import com.mfizaralfian.belajartunarungufizarapp.R;

import java.util.ArrayList;

public class InformasiData {

        public static String[][] data = new String[][]{
                {String.valueOf(R.drawable.aa1),
                        String.valueOf(R.raw.music),
                        "Huruf : A",
                        "Sebagian Text Hilang\n"

                },
                {String.valueOf(R.drawable.bb2),
                        String.valueOf(R.raw.music),
                        "Huruf : B",
                        "Sebagian Text Hilang\n"
                },
                {String.valueOf(R.drawable.cc3),
                        String.valueOf(R.raw.music),
                        "Huruf : C",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.dd4),
                        String.valueOf(R.raw.music),
                        "Huruf : D",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.ee5),
                        String.valueOf(R.raw.music),
                        "Huruf : E",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.ff6),
                        String.valueOf(R.raw.music),
                        "Huruf : F",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.gg7),
                        String.valueOf(R.raw.music),
                        "Huruf : G",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.hh8),
                        String.valueOf(R.raw.music),
                        "Huruf : H",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.ii9),
                        String.valueOf(R.raw.music),
                        "Huruf : I",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.jj10),
                        String.valueOf(R.raw.music),
                        "Huruf : J",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.kk11),
                        String.valueOf(R.raw.music),
                        "Huruf : K",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.ll12),
                        String.valueOf(R.raw.music),
                        "Huruf : L",
                        "Sebagian Text Hilang\n"    },
                {String.valueOf(R.drawable.mm13),
                        String.valueOf(R.raw.music),
                        "Huruf : M",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.nn14),
                        String.valueOf(R.raw.music),
                        "Huruf : N",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.oo15),
                        String.valueOf(R.raw.music),
                        "Huruf : O",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.pp16),
                        String.valueOf(R.raw.music),
                        "Huruf : P",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.qq17),
                        String.valueOf(R.raw.music),
                        "Huruf : Q",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.rr18),
                        String.valueOf(R.raw.music),
                        "Huruf : R",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.ss19),
                        String.valueOf(R.raw.music),
                        "Huruf : S",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.tt20),
                        String.valueOf(R.raw.music),
                        "Huruf : T",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.uu21),
                        String.valueOf(R.raw.music),
                        "Huruf : U",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.vv22),
                        String.valueOf(R.raw.music),
                        "Huruf : V",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.ww23),
                        String.valueOf(R.raw.music),
                        "Huruf : W",
                        "Sebagian Text Hilang\n"    },
                {String.valueOf(R.drawable.xx24),
                        String.valueOf(R.raw.music),
                        "Huruf : X",
                        "Sebagian Text Hilang\n"  },
                {String.valueOf(R.drawable.yy25),
                        String.valueOf(R.raw.music),
                        "Huruf : Y",
                        "Sebagian Text Hilang\n"   },
                {String.valueOf(R.drawable.zz26),
                        String.valueOf(R.raw.music),
                        "Huruf : Z",
                        "Sebagian Text Hilang\n"   },

        };
        public static ArrayList<DataModel> getListData(){
                DataModel dm= null;
                ArrayList<DataModel> list = new ArrayList<>();
                for (String[] aData : data) {
                        dm = new DataModel();
                        dm.setGambar(aData[0]);
                        dm.setSuara(aData[1]);
                        dm.setTittle(aData[2]);
                        dm.setDeskripsi(aData[3]);
                        list.add(dm);
                }
                return list;
        }
}
