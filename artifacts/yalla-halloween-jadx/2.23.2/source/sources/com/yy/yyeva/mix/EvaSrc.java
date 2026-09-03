package com.yy.yyeva.mix;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.foundation.layout.oo000o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.ImagesContract;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p612o0oo0OoO.o5;

/* JADX INFO: loaded from: classes4.dex */
public final class EvaSrc {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public String f32411OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f32412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f32413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f32414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SrcType f32415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f32416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final LoadType f32417OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f32418OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Bitmap f32419OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Style f32420OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f32421OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f32422OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public String f32423OooOOO0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yy/yyeva/mix/EvaSrc$FitType;", "", "", "type", "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "FIT_XY", "CENTER_FULL", "CENTER_FIT", "yyevac_release"}, k = 1, mv = {1, 8, 0})
    public enum FitType {
        FIT_XY("fitXY"),
        CENTER_FULL("centerFull"),
        CENTER_FIT("centerFull");


        @NotNull
        private final String type;

        FitType(String str) {
            this.type = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yy/yyeva/mix/EvaSrc$LoadType;", "", "", "type", "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "UNKNOWN", "NET", "LOCAL", "yyevac_release"}, k = 1, mv = {1, 8, 0})
    public enum LoadType {
        UNKNOWN("unknown"),
        NET("net"),
        LOCAL(ImagesContract.LOCAL);


        @NotNull
        private final String type;

        LoadType(String str) {
            this.type = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yy/yyeva/mix/EvaSrc$SrcType;", "", "", "type", "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "UNKNOWN", "IMG", "TXT", "yyevac_release"}, k = 1, mv = {1, 8, 0})
    public enum SrcType {
        UNKNOWN("unknown"),
        IMG("img"),
        TXT("txt");


        @NotNull
        private final String type;

        SrcType(String str) {
            this.type = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yy/yyeva/mix/EvaSrc$Style;", "", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "DEFAULT", "BOLD", "yyevac_release"}, k = 1, mv = {1, 8, 0})
    public enum Style {
        DEFAULT(NewFriendsOld.State_Default),
        BOLD("b");


        @NotNull
        private final String style;

        Style(String str) {
            this.style = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getStyle() {
            return this.style;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0065 A[PHI: r2
      0x0065: PHI (r2v11 com.yy.yyeva.mix.EvaSrc$SrcType) = (r2v9 com.yy.yyeva.mix.EvaSrc$SrcType), (r2v10 com.yy.yyeva.mix.EvaSrc$SrcType) binds: [B:9:0x0063, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public EvaSrc(@NotNull o5.OooO0o effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f32412OooO00o = "";
        SrcType srcType = SrcType.UNKNOWN;
        this.f32415OooO0Oo = srcType;
        this.f32417OooO0o0 = LoadType.UNKNOWN;
        this.f32416OooO0o = "";
        this.f32418OooO0oO = "scaleFill";
        this.f32411OooO = "";
        this.f32420OooOO0 = Style.DEFAULT;
        this.f32423OooOOO0 = "center";
        this.f32412OooO00o = String.valueOf(effect.f57447OooO0OO);
        this.f32413OooO0O0 = effect.f57445OooO00o;
        this.f32414OooO0OO = effect.f57446OooO0O0;
        String str = effect.f57451OooO0oO;
        str = str.length() == 0 ? "#000000" : str;
        this.f32421OooOO0O = Color.parseColor(str);
        String str2 = effect.f57448OooO0Oo;
        this.f32416OooO0o = str2;
        this.f32411OooO = str2;
        this.f32422OooOO0o = effect.f57452OooO0oo;
        this.f32423OooOOO0 = effect.f57444OooO;
        SrcType srcType2 = SrcType.IMG;
        String type = srcType2.getType();
        String str3 = effect.f57450OooO0o0;
        if (!Intrinsics.areEqual(str3, type)) {
            srcType2 = SrcType.TXT;
            srcType = Intrinsics.areEqual(str3, srcType2.getType()) ? srcType2 : srcType;
        }
        this.f32415OooO0Oo = srcType;
        String msg = this + " color=" + str;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaSrc", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Src(srcId='");
        sb.append(this.f32412OooO00o);
        sb.append("', srcType=");
        sb.append(this.f32415OooO0Oo);
        sb.append(", loadType=");
        sb.append(this.f32417OooO0o0);
        sb.append(", srcTag='");
        sb.append(this.f32416OooO0o);
        sb.append("', bitmap=");
        sb.append(this.f32419OooO0oo);
        sb.append(", txt='");
        sb.append(this.f32411OooO);
        sb.append(", textAlign = ");
        return oo000o.OooO0O0(sb, this.f32423OooOOO0, ')');
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0083 A[PHI: r6
      0x0083: PHI (r6v10 com.yy.yyeva.mix.EvaSrc$SrcType) = (r6v5 com.yy.yyeva.mix.EvaSrc$SrcType), (r6v6 com.yy.yyeva.mix.EvaSrc$SrcType) binds: [B:10:0x0081, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x00a6 A[PHI: r4
      0x00a6: PHI (r4v17 com.yy.yyeva.mix.EvaSrc$LoadType) = (r4v15 com.yy.yyeva.mix.EvaSrc$LoadType), (r4v16 com.yy.yyeva.mix.EvaSrc$LoadType) binds: [B:16:0x00a4, B:19:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    public EvaSrc(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f32412OooO00o = "";
        SrcType srcType = SrcType.UNKNOWN;
        this.f32415OooO0Oo = srcType;
        LoadType loadType = LoadType.UNKNOWN;
        this.f32417OooO0o0 = loadType;
        this.f32416OooO0o = "";
        this.f32418OooO0oO = "scaleFill";
        this.f32411OooO = "";
        Style style = Style.DEFAULT;
        this.f32420OooOO0 = style;
        this.f32423OooOOO0 = "center";
        String string = json.getString("srcId");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"srcId\")");
        this.f32412OooO00o = string;
        this.f32413OooO0O0 = json.getInt("w");
        this.f32414OooO0OO = json.getInt("h");
        String colorStr = json.optString("color", "#000000");
        Intrinsics.checkNotNullExpressionValue(colorStr, "colorStr");
        String str = colorStr.length() == 0 ? "#000000" : colorStr;
        this.f32421OooOO0O = Color.parseColor(str);
        String string2 = json.getString("srcTag");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"srcTag\")");
        this.f32416OooO0o = string2;
        this.f32411OooO = string2;
        String string3 = json.getString("srcType");
        SrcType srcType2 = SrcType.IMG;
        if (!Intrinsics.areEqual(string3, srcType2.getType())) {
            srcType2 = SrcType.TXT;
            srcType = Intrinsics.areEqual(string3, srcType2.getType()) ? srcType2 : srcType;
        }
        this.f32415OooO0Oo = srcType;
        String string4 = json.getString("loadType");
        LoadType loadType2 = LoadType.NET;
        if (!Intrinsics.areEqual(string4, loadType2.getType())) {
            loadType2 = LoadType.LOCAL;
            loadType = Intrinsics.areEqual(string4, loadType2.getType()) ? loadType2 : loadType;
        }
        this.f32417OooO0o0 = loadType;
        Intrinsics.areEqual(json.getString("fitType"), FitType.CENTER_FULL.getType());
        String strOptString = json.optString(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "");
        Style style2 = Style.BOLD;
        this.f32420OooOO0 = Intrinsics.areEqual(strOptString, style2.getStyle()) ? style2 : style;
        String msg = this + " color=" + str;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaSrc", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
