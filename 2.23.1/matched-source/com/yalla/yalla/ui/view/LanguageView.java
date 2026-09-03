package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/LanguageView;", "Landroid/widget/TextView;", "", "region", "", "setLanguage", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OooO0o0", "Z", "getTranslation", "()Z", "setTranslation", "(Z)V", "translation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"AppCompatCustomView"})
public final class LanguageView extends TextView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f29945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public boolean translation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean getTranslation() {
        return this.translation;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    public final void setLanguage(int region) {
        int i;
        this.f29945OooO0Oo = region;
        if (!this.translation) {
            switch (region) {
                case 0:
                    i = o000OOo.single_language_English;
                    break;
                case 1:
                    i = o000OOo.single_language_Arabic;
                    break;
                case 2:
                    i = o000OOo.single_language_Turkish;
                    break;
                case 3:
                    i = o000OOo.single_language_Indonesia;
                    break;
                case 4:
                    i = o000OOo.single_language_Japanese;
                    break;
                case 5:
                    i = o000OOo.single_language_Portugal;
                    break;
                case 6:
                    i = o000OOo.single_language_Espana;
                    break;
                case 7:
                    i = o000OOo.single_language_Hindi;
                    break;
                case 8:
                    i = o000OOo.single_language_Urdu;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            switch (region) {
                case 0:
                    i = o000OOo.English;
                    break;
                case 1:
                    i = o000OOo.Arabic;
                    break;
                case 2:
                    i = o000OOo.Turkish;
                    break;
                case 3:
                    i = o000OOo.Indonesia;
                    break;
                case 4:
                default:
                    i = -1;
                    break;
                case 5:
                    i = o000OOo.Portuguese;
                    break;
                case 6:
                    i = o000OOo.Spanish;
                    break;
                case 7:
                    i = o000OOo.Hindi;
                    break;
                case 8:
                    i = o000OOo.Urdu;
                    break;
            }
        }
        if (i == -1) {
            o000O.OooO0OO(this);
            setText("");
        } else {
            o000O.OooOOOO(this);
            setText(i);
        }
    }

    public final void setTranslation(boolean z) {
        if (this.translation != z) {
            this.translation = z;
            setLanguage(this.f29945OooO0Oo);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LanguageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LanguageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.translation = true;
    }
}
