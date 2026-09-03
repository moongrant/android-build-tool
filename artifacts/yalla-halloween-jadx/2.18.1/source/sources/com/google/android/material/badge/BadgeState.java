package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.XmlRes;
import com.google.android.material.internal.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.Locale;
import kotlin.KotlinVersion;
import o0OOO0O.OooO0OO;
import org.xmlpull.v1.XmlPullParserException;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.OooOo;
import p337o0OO0o0.OooOo00;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final State f16492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final State f16493OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f16494OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f16495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f16496OooO0o0;

    public BadgeState(Context context, @Nullable State state) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = BadgeDrawable.f16478OoooOoo;
        int i2 = BadgeDrawable.f16477OoooOoO;
        this.f16493OooO0O0 = new State();
        state = state == null ? new State() : state;
        int i3 = state.f16498Oooo0o;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Can't load badge resource ID #0x");
                sbOooO0o0.append(Integer.toHexString(i3));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sbOooO0o0.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSetAsAttributeSet, Oooo0.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f16494OooO0OO = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Badge_badgeRadius, resources.getDimensionPixelSize(OooOO0.mtrl_badge_radius));
        this.f16496OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Badge_badgeWidePadding, resources.getDimensionPixelSize(OooOO0.mtrl_badge_long_text_horizontal_padding));
        this.f16495OooO0Oo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(OooOO0.mtrl_badge_with_text_radius));
        State state2 = this.f16493OooO0O0;
        int i4 = state.f16497Oooo;
        state2.f16497Oooo = i4 == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : i4;
        CharSequence charSequence = state.f16501OoooO;
        state2.f16501OoooO = charSequence == null ? context.getString(OooOo.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f16493OooO0O0;
        int i5 = state.f16505OoooOO0;
        state3.f16505OoooOO0 = i5 == 0 ? OooOo00.mtrl_badge_content_description : i5;
        int i6 = state.f16514o000oOoO;
        state3.f16514o000oOoO = i6 == 0 ? OooOo.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = state.f16507OoooOOo;
        state3.f16507OoooOOo = Boolean.valueOf(bool == null || bool.booleanValue());
        State state4 = this.f16493OooO0O0;
        int i7 = state.f16502OoooO0;
        state4.f16502OoooO0 = i7 == -2 ? typedArrayOooO0Oo.getInt(Oooo0.Badge_maxCharacterCount, 4) : i7;
        int i8 = state.f16503OoooO00;
        if (i8 != -2) {
            this.f16493OooO0O0.f16503OoooO00 = i8;
        } else {
            int i9 = Oooo0.Badge_number;
            if (typedArrayOooO0Oo.hasValue(i9)) {
                this.f16493OooO0O0.f16503OoooO00 = typedArrayOooO0Oo.getInt(i9, 0);
            } else {
                this.f16493OooO0O0.f16503OoooO00 = -1;
            }
        }
        State state5 = this.f16493OooO0O0;
        Integer num = state.f16499Oooo0oO;
        state5.f16499Oooo0oO = Integer.valueOf(num == null ? OooO0OO.OooO00o(context, typedArrayOooO0Oo, Oooo0.Badge_backgroundColor).getDefaultColor() : num.intValue());
        Integer num2 = state.f16500Oooo0oo;
        if (num2 != null) {
            this.f16493OooO0O0.f16500Oooo0oo = num2;
        } else {
            int i10 = Oooo0.Badge_badgeTextColor;
            if (typedArrayOooO0Oo.hasValue(i10)) {
                this.f16493OooO0O0.f16500Oooo0oo = Integer.valueOf(OooO0OO.OooO00o(context, typedArrayOooO0Oo, i10).getDefaultColor());
            } else {
                int i11 = Oooo000.TextAppearance_MaterialComponents_Badge;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, Oooo0.TextAppearance);
                typedArrayObtainStyledAttributes.getDimension(Oooo0.TextAppearance_android_textSize, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColor);
                OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColorHint);
                OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColorLink);
                typedArrayObtainStyledAttributes.getInt(Oooo0.TextAppearance_android_textStyle, 0);
                typedArrayObtainStyledAttributes.getInt(Oooo0.TextAppearance_android_typeface, 1);
                int i12 = Oooo0.TextAppearance_fontFamily;
                i12 = typedArrayObtainStyledAttributes.hasValue(i12) ? i12 : Oooo0.TextAppearance_android_fontFamily;
                typedArrayObtainStyledAttributes.getResourceId(i12, 0);
                typedArrayObtainStyledAttributes.getString(i12);
                typedArrayObtainStyledAttributes.getBoolean(Oooo0.TextAppearance_textAllCaps, false);
                OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_shadowColor);
                typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowDx, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowDy, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowRadius, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i11, Oooo0.MaterialTextAppearance);
                int i13 = Oooo0.MaterialTextAppearance_android_letterSpacing;
                typedArrayObtainStyledAttributes2.hasValue(i13);
                typedArrayObtainStyledAttributes2.getFloat(i13, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                typedArrayObtainStyledAttributes2.recycle();
                this.f16493OooO0O0.f16500Oooo0oo = Integer.valueOf(colorStateListOooO00o.getDefaultColor());
            }
        }
        State state6 = this.f16493OooO0O0;
        Integer num3 = state.f16506OoooOOO;
        state6.f16506OoooOOO = Integer.valueOf(num3 == null ? typedArrayOooO0Oo.getInt(Oooo0.Badge_badgeGravity, 8388661) : num3.intValue());
        State state7 = this.f16493OooO0O0;
        Integer num4 = state.f16508OoooOo0;
        state7.f16508OoooOo0 = Integer.valueOf(num4 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.Badge_horizontalOffset, 0) : num4.intValue());
        this.f16493OooO0O0.f16509OoooOoO = Integer.valueOf(state.f16508OoooOo0 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.Badge_verticalOffset, 0) : state.f16509OoooOoO.intValue());
        State state8 = this.f16493OooO0O0;
        Integer num5 = state.f16510OoooOoo;
        state8.f16510OoooOoo = Integer.valueOf(num5 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.Badge_horizontalOffsetWithText, state8.f16508OoooOo0.intValue()) : num5.intValue());
        State state9 = this.f16493OooO0O0;
        Integer num6 = state.f16511Ooooo00;
        state9.f16511Ooooo00 = Integer.valueOf(num6 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.Badge_verticalOffsetWithText, state9.f16509OoooOoO.intValue()) : num6.intValue());
        State state10 = this.f16493OooO0O0;
        Integer num7 = state.f16512Ooooo0o;
        state10.f16512Ooooo0o = Integer.valueOf(num7 == null ? 0 : num7.intValue());
        State state11 = this.f16493OooO0O0;
        Integer num8 = state.f16513OooooO0;
        state11.f16513OooooO0 = Integer.valueOf(num8 != null ? num8.intValue() : 0);
        typedArrayOooO0Oo.recycle();
        Locale locale = state.f16504OoooO0O;
        if (locale == null) {
            this.f16493OooO0O0.f16504OoooO0O = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f16493OooO0O0.f16504OoooO0O = locale;
        }
        this.f16492OooO00o = state;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f16497Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @XmlRes
        public int f16498Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @ColorInt
        public Integer f16499Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @ColorInt
        public Integer f16500Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @Nullable
        public CharSequence f16501OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f16502OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f16503OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public Locale f16504OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @PluralsRes
        public int f16505OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public Integer f16506OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public Boolean f16507OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16508OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16509OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16510OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16511Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16512Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16513OooooO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @StringRes
        public int f16514o000oOoO;

        public class OooO00o implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.f16497Oooo = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f16503OoooO00 = -2;
            this.f16502OoooO0 = -2;
            this.f16507OoooOOo = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f16498Oooo0o);
            parcel.writeSerializable(this.f16499Oooo0oO);
            parcel.writeSerializable(this.f16500Oooo0oo);
            parcel.writeInt(this.f16497Oooo);
            parcel.writeInt(this.f16503OoooO00);
            parcel.writeInt(this.f16502OoooO0);
            CharSequence charSequence = this.f16501OoooO;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f16505OoooOO0);
            parcel.writeSerializable(this.f16506OoooOOO);
            parcel.writeSerializable(this.f16508OoooOo0);
            parcel.writeSerializable(this.f16509OoooOoO);
            parcel.writeSerializable(this.f16510OoooOoo);
            parcel.writeSerializable(this.f16511Ooooo00);
            parcel.writeSerializable(this.f16512Ooooo0o);
            parcel.writeSerializable(this.f16513OooooO0);
            parcel.writeSerializable(this.f16507OoooOOo);
            parcel.writeSerializable(this.f16504OoooO0O);
        }

        public State(@NonNull Parcel parcel) {
            this.f16497Oooo = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f16503OoooO00 = -2;
            this.f16502OoooO0 = -2;
            this.f16507OoooOOo = Boolean.TRUE;
            this.f16498Oooo0o = parcel.readInt();
            this.f16499Oooo0oO = (Integer) parcel.readSerializable();
            this.f16500Oooo0oo = (Integer) parcel.readSerializable();
            this.f16497Oooo = parcel.readInt();
            this.f16503OoooO00 = parcel.readInt();
            this.f16502OoooO0 = parcel.readInt();
            this.f16501OoooO = parcel.readString();
            this.f16505OoooOO0 = parcel.readInt();
            this.f16506OoooOOO = (Integer) parcel.readSerializable();
            this.f16508OoooOo0 = (Integer) parcel.readSerializable();
            this.f16509OoooOoO = (Integer) parcel.readSerializable();
            this.f16510OoooOoo = (Integer) parcel.readSerializable();
            this.f16511Ooooo00 = (Integer) parcel.readSerializable();
            this.f16512Ooooo0o = (Integer) parcel.readSerializable();
            this.f16513OooooO0 = (Integer) parcel.readSerializable();
            this.f16507OoooOOo = (Boolean) parcel.readSerializable();
            this.f16504OoooO0O = (Locale) parcel.readSerializable();
        }
    }
}
