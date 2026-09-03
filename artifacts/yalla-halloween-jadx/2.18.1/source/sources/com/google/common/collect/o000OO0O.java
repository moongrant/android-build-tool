package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public class o000OO0O<K, V> extends OooOOO0<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public final K f18454Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NullableDecl
    public final V f18455Oooo0oO;

    public o000OO0O(@NullableDecl K k, @NullableDecl V v) {
        this.f18454Oooo0o = k;
        this.f18455Oooo0oO = v;
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f18454Oooo0o;
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f18455Oooo0oO;
    }

    @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
