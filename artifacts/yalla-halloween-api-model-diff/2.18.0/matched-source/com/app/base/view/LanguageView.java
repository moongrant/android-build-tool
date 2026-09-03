package com.app.base.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/app/base/view/LanguageView;", "Landroid/widget/TextView;", "", "region", "", "setLanguage", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooO00", "Z", "getTranslation", "()Z", "setTranslation", "(Z)V", "translation", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"AppCompatCustomView"})
public final class LanguageView extends TextView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12064Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    public boolean translation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean getTranslation() {
        return this.translation;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    public final void setLanguage(int region) {
        int i;
        this.f12064Oooo = region;
        if (!this.translation) {
            switch (region) {
                case 0:
                    i = R.string.single_language_English;
                    break;
                case 1:
                    i = R.string.single_language_Arabic;
                    break;
                case 2:
                    i = R.string.single_language_Turkish;
                    break;
                case 3:
                    i = R.string.single_language_Indonesia;
                    break;
                case 4:
                    i = R.string.single_language_Japanese;
                    break;
                case 5:
                    i = R.string.single_language_Portugal;
                    break;
                case 6:
                    i = R.string.single_language_Espana;
                    break;
                case 7:
                    i = R.string.single_language_Hindi;
                    break;
                case 8:
                    i = R.string.single_language_Urdu;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            switch (region) {
                case 0:
                    i = R.string.English;
                    break;
                case 1:
                    i = R.string.Arabic;
                    break;
                case 2:
                    i = R.string.Turkish;
                    break;
                case 3:
                    i = R.string.Indonesia;
                    break;
                case 4:
                default:
                    i = -1;
                    break;
                case 5:
                    i = R.string.Portuguese;
                    break;
                case 6:
                    i = R.string.Spanish;
                    break;
                case 7:
                    i = R.string.Hindi;
                    break;
                case 8:
                    i = R.string.Urdu;
                    break;
            }
        }
        if (i == -1) {
            oOO00O.OooO0O0(this);
            setText("");
        } else {
            oOO00O.OooO(this);
            setText(i);
        }
    }

    public final void setTranslation(boolean z) {
        if (this.translation != z) {
            this.translation = z;
            setLanguage(this.f12064Oooo);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.translation = true;
    }
}
