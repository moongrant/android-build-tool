package com.ishumei.l111l1111llIl;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l111l1111llIl {
    public static void l1111l111111Il(SharedPreferences sharedPreferences, String str, int i) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static void l1111l111111Il(SharedPreferences sharedPreferences, String str, long j) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    private static void l1111l111111Il(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void l1111l111111Il(SharedPreferences sharedPreferences, String str, Set<String> set) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet(str, set);
        editorEdit.apply();
    }
}
