package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.UserDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/LanguageThemeModel;", "", "code", "", "language", "", UserDataStore.COUNTRY, "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getCountry", "()Ljava/lang/String;", "getLanguage", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LanguageThemeModel {
    public static final int $stable = 0;
    private final int code;

    @NotNull
    private final String country;

    @NotNull
    private final String language;

    public LanguageThemeModel(int i, @NotNull String language, @NotNull String country) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(country, "country");
        this.code = i;
        this.language = language;
        this.country = country;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }
}
