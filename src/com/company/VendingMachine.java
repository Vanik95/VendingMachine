package com.company;

import com.company.models.*;

import java.util.ArrayList;

public class VendingMachine {

    ArrayList<ArrayList<Product>> rowOneProducts = new ArrayList<>();
    ArrayList<ArrayList<Product>> rowTwoProducts = new ArrayList<>();
    ArrayList<ArrayList<Product>> rowThreeProducts = new ArrayList<>();
    ArrayList<ArrayList<Product>> rowFourProducts = new ArrayList<>();
    ArrayList<ArrayList<Product>> rowFiveProducts = new ArrayList<>();

    ArrayList<Product> bounties = new ArrayList<>();
    ArrayList<Product> byureghs = new ArrayList<>();
    ArrayList<Product> cocaColas = new ArrayList<>();
    ArrayList<Product> doritoses = new ArrayList<>();
    ArrayList<Product> fantas = new ArrayList<>();
    ArrayList<Product> fuzeTeas = new ArrayList<>();
    ArrayList<Product> jermuks = new ArrayList<>();
    ArrayList<Product> kitkats = new ArrayList<>();
    ArrayList<Product> layses = new ArrayList<>();
    ArrayList<Product> liptons = new ArrayList<>();
    ArrayList<Product> marses = new ArrayList<>();
    ArrayList<Product> mirindas = new ArrayList<>();
    ArrayList<Product> nesquicks = new ArrayList<>();
    ArrayList<Product> nestles = new ArrayList<>();
    ArrayList<Product> nutses = new ArrayList<>();
    ArrayList<Product> oreos = new ArrayList<>();
    ArrayList<Product> pepsis = new ArrayList<>();
    ArrayList<Product> picnics = new ArrayList<>();
    ArrayList<Product> schweppeses = new ArrayList<>();
    ArrayList<Product> sevenUps = new ArrayList<>();
    ArrayList<Product> skittleses = new ArrayList<>();
    ArrayList<Product> snickerses = new ArrayList<>();
    ArrayList<Product> sprites = new ArrayList<>();
    ArrayList<Product> toblerones = new ArrayList<>();
    ArrayList<Product> twixes = new ArrayList<>();

    public Product giveProduct(Command command) {
        if (command.getProductType() == ProductType.BOUNTY) {
            Bounty bounty = new Bounty();
            bounty.setProductCount(command.getProductCount());
            return bounty;
        } else if (command.getProductType() == ProductType.BYUREGH) {
            Byuregh byuregh = new Byuregh();
            byuregh.setProductCount(command.getProductCount());
            return byuregh;
        } else if (command.getProductType() == ProductType.COCACOLA) {
            CocaCola cocaCola = new CocaCola();
            cocaCola.setProductCount(command.getProductCount());
            return cocaCola;
        } else if (command.getProductType() == ProductType.DORITOS) {
            Doritos doritos = new Doritos();
            doritos.setProductCount(command.getProductCount());
            return doritos;
        } else if (command.getProductType() == ProductType.FANTA) {
            Fanta fanta = new Fanta();
            fanta.setProductCount(command.getProductCount());
            return fanta;
        } else if (command.getProductType() == ProductType.FUZETEA) {
            FuzeTea fuzeTea = new FuzeTea();
            fuzeTea.setProductCount(command.getProductCount());
            return fuzeTea;
        } else if (command.getProductType() == ProductType.JERMUK) {
            Jermuk jermuk = new Jermuk();
            jermuk.setProductCount(command.getProductCount());
            return jermuk;
        } else if (command.getProductType() == ProductType.KITKAT) {
            Kitkat kitkat = new Kitkat();
            kitkat.setProductCount(command.getProductCount());
            return kitkat;
        } else if (command.getProductType() == ProductType.LAYS) {
            Lays lays = new Lays();
            lays.setProductCount(command.getProductCount());
            return lays;
        } else if (command.getProductType() == ProductType.LIPTON) {
            Lipton lipton = new Lipton();
            lipton.setProductCount(command.getProductCount());
            return lipton;
        } else if (command.getProductType() == ProductType.MARS) {
            Mars mars = new Mars();
            mars.setProductCount(command.getProductCount());
            return mars;
        } else if (command.getProductType() == ProductType.MIRINDA) {
            Mirinda mirinda = new Mirinda();
            mirinda.setProductCount(command.getProductCount());
            return mirinda;
        } else if (command.getProductType() == ProductType.NESQUICK) {
            Nesquick nesquick = new Nesquick();
            nesquick.setProductCount(command.getProductCount());
            return nesquick;
        } else if (command.getProductType() == ProductType.NESTLE) {
            Nestle nestle = new Nestle();
            nestle.setProductCount(command.getProductCount());
            return nestle;
        } else if (command.getProductType() == ProductType.NUTS) {
            Nuts nuts = new Nuts();
            nuts.setProductCount(command.getProductCount());
            return nuts;
        } else if (command.getProductType() == ProductType.OREO) {
            Oreo oreo = new Oreo();
            oreo.setProductCount(command.getProductCount());
            return oreo;
        } else if (command.getProductType() == ProductType.PEPSI) {
            Pepsi pepsi = new Pepsi();
            pepsi.setProductCount(command.getProductCount());
            return pepsi;
        } else if (command.getProductType() == ProductType.PICNIC) {
            Picnic picnic = new Picnic();
            picnic.setProductCount(command.getProductCount());
            return picnic;
        } else if (command.getProductType() == ProductType.SCHWEPPES) {
            Schweppes schweppes = new Schweppes();
            schweppes.setProductCount(command.getProductCount());
            return schweppes;
        } else if (command.getProductType() == ProductType.SEVENUP) {
            SevenUp sevenUp = new SevenUp();
            sevenUp.setProductCount(command.getProductCount());
            return sevenUp;
        } else if (command.getProductType() == ProductType.SKITTLES) {
            Skittles skittles = new Skittles();
            skittles.setProductCount(command.getProductCount());
            return skittles;
        } else if (command.getProductType() == ProductType.SNICKERS) {
            Snickers snickers = new Snickers();
            snickers.setProductCount(command.getProductCount());
            return snickers;
        } else if (command.getProductType() == ProductType.SPRITE) {
            Sprite sprite = new Sprite();
            sprite.setProductCount(command.getProductCount());
            return sprite;
        } else if (command.getProductType() == ProductType.TOBLERONE) {
            Toblerone toblerone = new Toblerone();
            toblerone.setProductCount(command.getProductCount());
            return toblerone;
        } else if (command.getProductType() == ProductType.TWIX) {
            Twix twix = new Twix();
            twix.setProductCount(command.getProductCount());
            return twix;
        }
        return null;
    }

    public void initializeProductsArrays() {
        for (int i = 0; i < 10; i++) {
            Bounty bounty = new Bounty();
            bounties.add(bounty);
            Byuregh byuregh = new Byuregh();
            byureghs.add(byuregh);
            CocaCola cocaCola = new CocaCola();
            cocaColas.add(cocaCola);
            Doritos doritos = new Doritos();
            doritoses.add(doritos);
            Fanta fanta = new Fanta();
            fantas.add(fanta);
            FuzeTea fuzeTea = new FuzeTea();
            fuzeTeas.add(fuzeTea);
            Jermuk jermuk = new Jermuk();
            jermuks.add(jermuk);
            Kitkat kitkat = new Kitkat();
            kitkats.add(kitkat);
            Lays lays = new Lays();
            layses.add(lays);
            Lipton lipton = new Lipton();
            liptons.add(lipton);
            Mars mars = new Mars();
            marses.add(mars);
            Mirinda mirinda = new Mirinda();
            mirindas.add(mirinda);
            Nesquick nesquick = new Nesquick();
            nesquicks.add(nesquick);
            Nestle nestle = new Nestle();
            nestles.add(nestle);
            Nuts nuts = new Nuts();
            nutses.add(nuts);
            Oreo oreo = new Oreo();
            oreos.add(oreo);
            Pepsi pepsi = new Pepsi();
            pepsis.add(pepsi);
            Picnic picnic = new Picnic();
            picnics.add(picnic);
            Schweppes schweppes = new Schweppes();
            schweppeses.add(schweppes);
            SevenUp sevenUp = new SevenUp();
            sevenUps.add(sevenUp);
            Skittles skittles = new Skittles();
            skittleses.add(skittles);
            Snickers snickers = new Snickers();
            snickerses.add(snickers);
            Sprite sprite = new Sprite();
            sprites.add(sprite);
            Toblerone toblerone = new Toblerone();
            toblerones.add(toblerone);
            Twix twix = new Twix();
            twixes.add(twix);
        }
    }

    public void initializeBoard() {

        rowOneProducts.add(bounties);
        rowOneProducts.add(byureghs);
        rowOneProducts.add(cocaColas);
        rowOneProducts.add(doritoses);
        rowOneProducts.add(fantas);
        rowTwoProducts.add(fuzeTeas);
        rowTwoProducts.add(jermuks);
        rowTwoProducts.add(kitkats);
        rowTwoProducts.add(layses);
        rowTwoProducts.add(liptons);
        rowThreeProducts.add(marses);
        rowThreeProducts.add(mirindas);
        rowThreeProducts.add(nesquicks);
        rowThreeProducts.add(nestles);
        rowThreeProducts.add(nutses);
        rowFourProducts.add(oreos);
        rowFourProducts.add(pepsis);
        rowFourProducts.add(picnics);
        rowFourProducts.add(schweppeses);
        rowFourProducts.add(sevenUps);
        rowFiveProducts.add(skittleses);
        rowFiveProducts.add(snickerses);
        rowFiveProducts.add(sprites);
        rowFiveProducts.add(toblerones);
        rowFiveProducts.add(twixes);
    }

    public void removeProducts(Command command) {
        for (int i = 0; i < command.getProductCount(); i++) {
            if (command.getProductType() == ProductType.BOUNTY) {
                bounties.remove(0);
            } else if (command.getProductType() == ProductType.BYUREGH) {
                byureghs.remove(0);
            } else if (command.getProductType() == ProductType.COCACOLA) {
                cocaColas.remove(0);
            } else if (command.getProductType() == ProductType.DORITOS) {
                doritoses.remove(0);
            } else if (command.getProductType() == ProductType.FANTA) {
                fantas.remove(0);
            } else if (command.getProductType() == ProductType.FUZETEA) {
                fuzeTeas.remove(0);
            } else if (command.getProductType() == ProductType.JERMUK) {
                jermuks.remove(0);
            } else if (command.getProductType() == ProductType.KITKAT) {
                kitkats.remove(0);
            } else if (command.getProductType() == ProductType.LAYS) {
                layses.remove(0);
            } else if (command.getProductType() == ProductType.LIPTON) {
                liptons.remove(0);
            } else if (command.getProductType() == ProductType.MARS) {
                marses.remove(0);
            } else if (command.getProductType() == ProductType.MIRINDA) {
                mirindas.remove(0);
            } else if (command.getProductType() == ProductType.NESQUICK) {
                nesquicks.remove(0);
            } else if (command.getProductType() == ProductType.NESTLE) {
                nestles.remove(0);
            } else if (command.getProductType() == ProductType.NUTS) {
                nutses.remove(0);
            } else if (command.getProductType() == ProductType.OREO) {
                oreos.remove(0);
            } else if (command.getProductType() == ProductType.PEPSI) {
                pepsis.remove(0);
            } else if (command.getProductType() == ProductType.PICNIC) {
                picnics.remove(0);
            } else if (command.getProductType() == ProductType.SCHWEPPES) {
                schweppeses.remove(0);
            } else if (command.getProductType() == ProductType.SEVENUP) {
                sevenUps.remove(0);
            } else if (command.getProductType() == ProductType.SKITTLES) {
                skittleses.remove(0);
            } else if (command.getProductType() == ProductType.SNICKERS) {
                snickerses.remove(0);
            } else if (command.getProductType() == ProductType.SPRITE) {
                sprites.remove(0);
            } else if (command.getProductType() == ProductType.TOBLERONE) {
                toblerones.remove(0);
            } else if (command.getProductType() == ProductType.TWIX) {
                twixes.remove(0);
            }
        }
    }
    public void showProductBalance(Command command) {
        if (command.getProductType() == ProductType.BOUNTY) {
            System.out.print(", the product balance is - " + bounties.size());
        } else if (command.getProductType() == ProductType.BYUREGH) {
            System.out.print(", the product balance is - " + byureghs.size());
        } else if (command.getProductType() == ProductType.COCACOLA) {
            System.out.print(", the product balance is - " + cocaColas.size());
        } else if (command.getProductType() == ProductType.DORITOS) {
            System.out.print(", the product balance is - " + doritoses.size());
        } else if (command.getProductType() == ProductType.FANTA) {
            System.out.print(", the product balance is - " + fantas.size());
        } else if (command.getProductType() == ProductType.FUZETEA) {
            System.out.print(", the product balance is - " + fuzeTeas.size());
        } else if (command.getProductType() == ProductType.JERMUK) {
            System.out.print(", the product balance is - " + jermuks.size());
        } else if (command.getProductType() == ProductType.KITKAT) {
            System.out.print(", the product balance is - " + kitkats.size());
        } else if (command.getProductType() == ProductType.LAYS) {
            System.out.print(", the product balance is - " + layses.size());
        } else if (command.getProductType() == ProductType.LIPTON) {
            System.out.print(", the product balance is - " + liptons.size());
        } else if (command.getProductType() == ProductType.MARS) {
            System.out.print(", the product balance is - " + marses.size());
        } else if (command.getProductType() == ProductType.MIRINDA) {
            System.out.print(", the product balance is - " + mirindas.size());
        } else if (command.getProductType() == ProductType.NESQUICK) {
            System.out.print(", the product balance is - " + nesquicks.size());
        } else if (command.getProductType() == ProductType.NESTLE) {
            System.out.print(", the product balance is - " + nestles.size());
        } else if (command.getProductType() == ProductType.NUTS) {
            System.out.print(", the product balance is - " + nutses.size());
        } else if (command.getProductType() == ProductType.OREO) {
            System.out.print(", the product balance is - " + oreos.size());
        } else if (command.getProductType() == ProductType.PEPSI) {
            System.out.print(", the product balance is - " + pepsis.size());
        } else if (command.getProductType() == ProductType.PICNIC) {
            System.out.print(", the product balance is - " + picnics.size());
        } else if (command.getProductType() == ProductType.SCHWEPPES) {
            System.out.print(", the product balance is - " + schweppeses.size());
        } else if (command.getProductType() == ProductType.SEVENUP) {
            System.out.print(", the product balance is - " + sevenUps.size());
        } else if (command.getProductType() == ProductType.SKITTLES) {
            System.out.print(", the product balance is - " + skittleses.size());
        } else if (command.getProductType() == ProductType.SNICKERS) {
            System.out.print(", the product balance is - " + snickerses.size());
        } else if (command.getProductType() == ProductType.SPRITE) {
            System.out.print(", the product balance is - " + sprites.size());
        } else if (command.getProductType() == ProductType.TOBLERONE) {
            System.out.print(", the product balance is - " + toblerones.size());
        } else if (command.getProductType() == ProductType.TWIX) {
            System.out.print(", the product balance is - " + twixes.size());
        }
    }
}