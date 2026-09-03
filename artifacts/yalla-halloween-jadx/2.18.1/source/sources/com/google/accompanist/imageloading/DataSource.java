package com.google.accompanist.imageloading;

import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "Accompanist-ImageLoading is now deprecated. Consider using Coil: https://coil-kt.github.io/coil/compose")
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/accompanist/imageloading/DataSource;", "", "MEMORY", "DISK", "NETWORK", "imageloading-core_release"}, k = 1, mv = {1, 5, 1})
public enum DataSource {
    MEMORY,
    DISK,
    NETWORK;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static DataSource[] valuesCustom() {
        DataSource[] dataSourceArrValuesCustom = values();
        return (DataSource[]) Arrays.copyOf(dataSourceArrValuesCustom, dataSourceArrValuesCustom.length);
    }
}
