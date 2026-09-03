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
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.material.internal.o00oO0o;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000oo;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f16301OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final State f16302OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final State f16303OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f16304OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f16305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f16306OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f16307OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f16308OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f16309OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f16310OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f16311OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f16312OooOO0o;

    public BadgeState(Context context, @Nullable State state) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = BadgeDrawable.f16286OooOOo;
        int i2 = BadgeDrawable.f16287OooOOo0;
        this.f16303OooO0O0 = new State();
        state = state == null ? new State() : state;
        int i3 = state.f16314OooO0Oo;
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
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSetAsAttributeSet, o000OO.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f16304OooO0OO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeRadius, -1);
        this.f16301OooO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeWidePadding, resources.getDimensionPixelSize(o00000O.mtrl_badge_long_text_horizontal_padding));
        this.f16310OooOO0 = context.getResources().getDimensionPixelSize(o00000O.mtrl_badge_horizontal_edge_offset);
        this.f16311OooOO0O = context.getResources().getDimensionPixelSize(o00000O.mtrl_badge_text_horizontal_edge_offset);
        this.f16305OooO0Oo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeWithTextRadius, -1);
        int i4 = o000OO.Badge_badgeWidth;
        int i5 = o00000O.m3_badge_size;
        this.f16307OooO0o0 = typedArrayOooO0Oo.getDimension(i4, resources.getDimension(i5));
        int i6 = o000OO.Badge_badgeWithTextWidth;
        int i7 = o00000O.m3_badge_with_text_size;
        this.f16308OooO0oO = typedArrayOooO0Oo.getDimension(i6, resources.getDimension(i7));
        this.f16306OooO0o = typedArrayOooO0Oo.getDimension(o000OO.Badge_badgeHeight, resources.getDimension(i5));
        this.f16309OooO0oo = typedArrayOooO0Oo.getDimension(o000OO.Badge_badgeWithTextHeight, resources.getDimension(i7));
        this.f16312OooOO0o = typedArrayOooO0Oo.getInt(o000OO.Badge_offsetAlignmentMode, 1);
        State state2 = this.f16303OooO0O0;
        int i8 = state.f16321OooOO0o;
        state2.f16321OooOO0o = i8 == -2 ? 255 : i8;
        CharSequence charSequence = state.f16325OooOOOo;
        state2.f16325OooOOOo = charSequence == null ? context.getString(o0000O0.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f16303OooO0O0;
        int i9 = state.f16327OooOOo0;
        state3.f16327OooOOo0 = i9 == 0 ? o0000oo.mtrl_badge_content_description : i9;
        int i10 = state.f16326OooOOo;
        state3.f16326OooOOo = i10 == 0 ? o0000O0.mtrl_exceed_max_badge_number_content_description : i10;
        Boolean bool = state.f16331OooOo00;
        state3.f16331OooOo00 = Boolean.valueOf(bool == null || bool.booleanValue());
        State state4 = this.f16303OooO0O0;
        int i11 = state.f16322OooOOO;
        state4.f16322OooOOO = i11 == -2 ? typedArrayOooO0Oo.getInt(o000OO.Badge_maxCharacterCount, 4) : i11;
        int i12 = state.f16323OooOOO0;
        if (i12 != -2) {
            this.f16303OooO0O0.f16323OooOOO0 = i12;
        } else {
            int i13 = o000OO.Badge_number;
            if (typedArrayOooO0Oo.hasValue(i13)) {
                this.f16303OooO0O0.f16323OooOOO0 = typedArrayOooO0Oo.getInt(i13, 0);
            } else {
                this.f16303OooO0O0.f16323OooOOO0 = -1;
            }
        }
        State state5 = this.f16303OooO0O0;
        Integer num = state.f16318OooO0oo;
        state5.f16318OooO0oo = Integer.valueOf(num == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeShapeAppearance, o0000O0O.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state6 = this.f16303OooO0O0;
        Integer num2 = state.f16313OooO;
        state6.f16313OooO = Integer.valueOf(num2 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        State state7 = this.f16303OooO0O0;
        Integer num3 = state.f16319OooOO0;
        state7.f16319OooOO0 = Integer.valueOf(num3 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeWithTextShapeAppearance, o0000O0O.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state8 = this.f16303OooO0O0;
        Integer num4 = state.f16320OooOO0O;
        state8.f16320OooOO0O = Integer.valueOf(num4 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        State state9 = this.f16303OooO0O0;
        Integer num5 = state.f16316OooO0o0;
        state9.f16316OooO0o0 = Integer.valueOf(num5 == null ? c1.OooO00o(context, typedArrayOooO0Oo, o000OO.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        State state10 = this.f16303OooO0O0;
        Integer num6 = state.f16317OooO0oO;
        state10.f16317OooO0oO = Integer.valueOf(num6 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeTextAppearance, o0000O0O.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.f16315OooO0o;
        if (num7 != null) {
            this.f16303OooO0O0.f16315OooO0o = num7;
        } else {
            int i14 = o000OO.Badge_badgeTextColor;
            if (typedArrayOooO0Oo.hasValue(i14)) {
                this.f16303OooO0O0.f16315OooO0o = Integer.valueOf(c1.OooO00o(context, typedArrayOooO0Oo, i14).getDefaultColor());
            } else {
                int iIntValue = this.f16303OooO0O0.f16317OooO0oO.intValue();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, o000OO.TextAppearance);
                typedArrayObtainStyledAttributes.getDimension(o000OO.TextAppearance_android_textSize, 0.0f);
                ColorStateList colorStateListOooO00o = c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColor);
                c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorHint);
                c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorLink);
                typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_textStyle, 0);
                typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_typeface, 1);
                int i15 = o000OO.TextAppearance_fontFamily;
                i15 = typedArrayObtainStyledAttributes.hasValue(i15) ? i15 : o000OO.TextAppearance_android_fontFamily;
                typedArrayObtainStyledAttributes.getResourceId(i15, 0);
                typedArrayObtainStyledAttributes.getString(i15);
                typedArrayObtainStyledAttributes.getBoolean(o000OO.TextAppearance_textAllCaps, false);
                c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_shadowColor);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDx, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDy, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowRadius, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, o000OO.MaterialTextAppearance);
                int i16 = o000OO.MaterialTextAppearance_android_letterSpacing;
                typedArrayObtainStyledAttributes2.hasValue(i16);
                typedArrayObtainStyledAttributes2.getFloat(i16, 0.0f);
                typedArrayObtainStyledAttributes2.recycle();
                this.f16303OooO0O0.f16315OooO0o = Integer.valueOf(colorStateListOooO00o.getDefaultColor());
            }
        }
        State state11 = this.f16303OooO0O0;
        Integer num8 = state.f16328OooOOoo;
        state11.f16328OooOOoo = Integer.valueOf(num8 == null ? typedArrayOooO0Oo.getInt(o000OO.Badge_badgeGravity, 8388661) : num8.intValue());
        State state12 = this.f16303OooO0O0;
        Integer num9 = state.f16330OooOo0;
        state12.f16330OooOo0 = Integer.valueOf(num9 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_horizontalOffset, 0) : num9.intValue());
        State state13 = this.f16303OooO0O0;
        Integer num10 = state.f16332OooOo0O;
        state13.f16332OooOo0O = Integer.valueOf(num10 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_verticalOffset, 0) : num10.intValue());
        State state14 = this.f16303OooO0O0;
        Integer num11 = state.f16333OooOo0o;
        state14.f16333OooOo0o = Integer.valueOf(num11 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_horizontalOffsetWithText, state14.f16330OooOo0.intValue()) : num11.intValue());
        State state15 = this.f16303OooO0O0;
        Integer num12 = state.f16329OooOo;
        state15.f16329OooOo = Integer.valueOf(num12 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_verticalOffsetWithText, state15.f16332OooOo0O.intValue()) : num12.intValue());
        State state16 = this.f16303OooO0O0;
        Integer num13 = state.f16335OooOoO0;
        state16.f16335OooOoO0 = Integer.valueOf(num13 == null ? 0 : num13.intValue());
        State state17 = this.f16303OooO0O0;
        Integer num14 = state.f16334OooOoO;
        state17.f16334OooOoO = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        typedArrayOooO0Oo.recycle();
        Locale locale = state.f16324OooOOOO;
        if (locale == null) {
            this.f16303OooO0O0.f16324OooOOOO = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f16303OooO0O0.f16324OooOOOO = locale;
        }
        this.f16302OooO00o = state;
    }

    public final boolean OooO00o() {
        return this.f16303OooO0O0.f16323OooOOO0 != -1;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @StyleRes
        public Integer f16313OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @XmlRes
        public int f16314OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @ColorInt
        public Integer f16315OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ColorInt
        public Integer f16316OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @StyleRes
        public Integer f16317OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @StyleRes
        public Integer f16318OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @StyleRes
        public Integer f16319OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @StyleRes
        public Integer f16320OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f16321OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f16322OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f16323OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Locale f16324OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public CharSequence f16325OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @StringRes
        public int f16326OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @PluralsRes
        public int f16327OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Integer f16328OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16329OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16330OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public Boolean f16331OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16332OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16333OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16334OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f16335OooOoO0;

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
            this.f16321OooOO0o = 255;
            this.f16323OooOOO0 = -2;
            this.f16322OooOOO = -2;
            this.f16331OooOo00 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f16314OooO0Oo);
            parcel.writeSerializable(this.f16316OooO0o0);
            parcel.writeSerializable(this.f16315OooO0o);
            parcel.writeSerializable(this.f16317OooO0oO);
            parcel.writeSerializable(this.f16318OooO0oo);
            parcel.writeSerializable(this.f16313OooO);
            parcel.writeSerializable(this.f16319OooOO0);
            parcel.writeSerializable(this.f16320OooOO0O);
            parcel.writeInt(this.f16321OooOO0o);
            parcel.writeInt(this.f16323OooOOO0);
            parcel.writeInt(this.f16322OooOOO);
            CharSequence charSequence = this.f16325OooOOOo;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f16327OooOOo0);
            parcel.writeSerializable(this.f16328OooOOoo);
            parcel.writeSerializable(this.f16330OooOo0);
            parcel.writeSerializable(this.f16332OooOo0O);
            parcel.writeSerializable(this.f16333OooOo0o);
            parcel.writeSerializable(this.f16329OooOo);
            parcel.writeSerializable(this.f16335OooOoO0);
            parcel.writeSerializable(this.f16334OooOoO);
            parcel.writeSerializable(this.f16331OooOo00);
            parcel.writeSerializable(this.f16324OooOOOO);
        }

        public State(@NonNull Parcel parcel) {
            this.f16321OooOO0o = 255;
            this.f16323OooOOO0 = -2;
            this.f16322OooOOO = -2;
            this.f16331OooOo00 = Boolean.TRUE;
            this.f16314OooO0Oo = parcel.readInt();
            this.f16316OooO0o0 = (Integer) parcel.readSerializable();
            this.f16315OooO0o = (Integer) parcel.readSerializable();
            this.f16317OooO0oO = (Integer) parcel.readSerializable();
            this.f16318OooO0oo = (Integer) parcel.readSerializable();
            this.f16313OooO = (Integer) parcel.readSerializable();
            this.f16319OooOO0 = (Integer) parcel.readSerializable();
            this.f16320OooOO0O = (Integer) parcel.readSerializable();
            this.f16321OooOO0o = parcel.readInt();
            this.f16323OooOOO0 = parcel.readInt();
            this.f16322OooOOO = parcel.readInt();
            this.f16325OooOOOo = parcel.readString();
            this.f16327OooOOo0 = parcel.readInt();
            this.f16328OooOOoo = (Integer) parcel.readSerializable();
            this.f16330OooOo0 = (Integer) parcel.readSerializable();
            this.f16332OooOo0O = (Integer) parcel.readSerializable();
            this.f16333OooOo0o = (Integer) parcel.readSerializable();
            this.f16329OooOo = (Integer) parcel.readSerializable();
            this.f16335OooOoO0 = (Integer) parcel.readSerializable();
            this.f16334OooOoO = (Integer) parcel.readSerializable();
            this.f16331OooOo00 = (Boolean) parcel.readSerializable();
            this.f16324OooOOOO = (Locale) parcel.readSerializable();
        }
    }
}
