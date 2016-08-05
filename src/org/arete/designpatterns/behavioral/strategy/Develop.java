/**
 * Copyright (c) aretelife.org, 2015. All Rights Reserved.
 */
package org.arete.designpatterns.behavioral.strategy;

public class Develop {

    private Coder _coder;
    private Builder _builder;
    private Tester _tester;

    public Develop(Coder coder, Builder builder, Tester tester) {

        this._coder = coder;
        this._builder = builder;
        this._tester = tester;
    }

    public void code() {

        this._coder.writeCode();
        this._builder.buildCode();
        this._tester.testCode();
    }
}
