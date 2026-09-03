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
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o0000oo;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f15829OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final State f15830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final State f15831OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f15832OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f15833OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f15834OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f15835OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f15836OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f15837OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f15838OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f15839OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f15840OooOO0o;

    public BadgeState(Context context, @Nullable State state) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = BadgeDrawable.f15814OooOOo;
        int i2 = BadgeDrawable.f15815OooOOo0;
        this.f15831OooO0O0 = new State();
        state = state == null ? new State() : state;
        int i3 = state.f15842OooO0Oo;
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
        this.f15832OooO0OO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeRadius, -1);
        this.f15829OooO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeWidePadding, resources.getDimensionPixelSize(o00000O.mtrl_badge_long_text_horizontal_padding));
        this.f15838OooOO0 = context.getResources().getDimensionPixelSize(o00000O.mtrl_badge_horizontal_edge_offset);
        this.f15839OooOO0O = context.getResources().getDimensionPixelSize(o00000O.mtrl_badge_text_horizontal_edge_offset);
        this.f15833OooO0Oo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Badge_badgeWithTextRadius, -1);
        int i4 = o000OO.Badge_badgeWidth;
        int i5 = o00000O.m3_badge_size;
        this.f15835OooO0o0 = typedArrayOooO0Oo.getDimension(i4, resources.getDimension(i5));
        int i6 = o000OO.Badge_badgeWithTextWidth;
        int i7 = o00000O.m3_badge_with_text_size;
        this.f15836OooO0oO = typedArrayOooO0Oo.getDimension(i6, resources.getDimension(i7));
        this.f15834OooO0o = typedArrayOooO0Oo.getDimension(o000OO.Badge_badgeHeight, resources.getDimension(i5));
        this.f15837OooO0oo = typedArrayOooO0Oo.getDimension(o000OO.Badge_badgeWithTextHeight, resources.getDimension(i7));
        this.f15840OooOO0o = typedArrayOooO0Oo.getInt(o000OO.Badge_offsetAlignmentMode, 1);
        State state2 = this.f15831OooO0O0;
        int i8 = state.f15849OooOO0o;
        state2.f15849OooOO0o = i8 == -2 ? 255 : i8;
        CharSequence charSequence = state.f15853OooOOOo;
        state2.f15853OooOOOo = charSequence == null ? context.getString(o0000O0.mtrl_badge_numberless_content_description) : charSequence;
        State state3 = this.f15831OooO0O0;
        int i9 = state.f15855OooOOo0;
        state3.f15855OooOOo0 = i9 == 0 ? o0000oo.mtrl_badge_content_description : i9;
        int i10 = state.f15854OooOOo;
        state3.f15854OooOOo = i10 == 0 ? o0000O0.mtrl_exceed_max_badge_number_content_description : i10;
        Boolean bool = state.f15859OooOo00;
        state3.f15859OooOo00 = Boolean.valueOf(bool == null || bool.booleanValue());
        State state4 = this.f15831OooO0O0;
        int i11 = state.f15850OooOOO;
        state4.f15850OooOOO = i11 == -2 ? typedArrayOooO0Oo.getInt(o000OO.Badge_maxCharacterCount, 4) : i11;
        int i12 = state.f15851OooOOO0;
        if (i12 != -2) {
            this.f15831OooO0O0.f15851OooOOO0 = i12;
        } else {
            int i13 = o000OO.Badge_number;
            if (typedArrayOooO0Oo.hasValue(i13)) {
                this.f15831OooO0O0.f15851OooOOO0 = typedArrayOooO0Oo.getInt(i13, 0);
            } else {
                this.f15831OooO0O0.f15851OooOOO0 = -1;
            }
        }
        State state5 = this.f15831OooO0O0;
        Integer num = state.f15846OooO0oo;
        state5.f15846OooO0oo = Integer.valueOf(num == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeShapeAppearance, o0000O0O.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state6 = this.f15831OooO0O0;
        Integer num2 = state.f15841OooO;
        state6.f15841OooO = Integer.valueOf(num2 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        State state7 = this.f15831OooO0O0;
        Integer num3 = state.f15847OooOO0;
        state7.f15847OooOO0 = Integer.valueOf(num3 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeWithTextShapeAppearance, o0000O0O.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state8 = this.f15831OooO0O0;
        Integer num4 = state.f15848OooOO0O;
        state8.f15848OooOO0O = Integer.valueOf(num4 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        State state9 = this.f15831OooO0O0;
        Integer num5 = state.f15844OooO0o0;
        state9.f15844OooO0o0 = Integer.valueOf(num5 == null ? OooO0o.OooO00o(context, typedArrayOooO0Oo, o000OO.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        State state10 = this.f15831OooO0O0;
        Integer num6 = state.f15845OooO0oO;
        state10.f15845OooO0oO = Integer.valueOf(num6 == null ? typedArrayOooO0Oo.getResourceId(o000OO.Badge_badgeTextAppearance, o0000O0O.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.f15843OooO0o;
        if (num7 != null) {
            this.f15831OooO0O0.f15843OooO0o = num7;
        } else {
            int i14 = o000OO.Badge_badgeTextColor;
            if (typedArrayOooO0Oo.hasValue(i14)) {
                this.f15831OooO0O0.f15843OooO0o = Integer.valueOf(OooO0o.OooO00o(context, typedArrayOooO0Oo, i14).getDefaultColor());
            } else {
                int iIntValue = this.f15831OooO0O0.f15845OooO0oO.intValue();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, o000OO.TextAppearance);
                typedArrayObtainStyledAttributes.getDimension(o000OO.TextAppearance_android_textSize, 0.0f);
                ColorStateList colorStateListOooO00o = OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColor);
                OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorHint);
                OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorLink);
                typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_textStyle, 0);
                typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_typeface, 1);
                int i15 = o000OO.TextAppearance_fontFamily;
                i15 = typedArrayObtainStyledAttributes.hasValue(i15) ? i15 : o000OO.TextAppearance_android_fontFamily;
                typedArrayObtainStyledAttributes.getResourceId(i15, 0);
                typedArrayObtainStyledAttributes.getString(i15);
                typedArrayObtainStyledAttributes.getBoolean(o000OO.TextAppearance_textAllCaps, false);
                OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_shadowColor);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDx, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDy, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowRadius, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, o000OO.MaterialTextAppearance);
                int i16 = o000OO.MaterialTextAppearance_android_letterSpacing;
                typedArrayObtainStyledAttributes2.hasValue(i16);
                typedArrayObtainStyledAttributes2.getFloat(i16, 0.0f);
                typedArrayObtainStyledAttributes2.recycle();
                this.f15831OooO0O0.f15843OooO0o = Integer.valueOf(colorStateListOooO00o.getDefaultColor());
            }
        }
        State state11 = this.f15831OooO0O0;
        Integer num8 = state.f15856OooOOoo;
        state11.f15856OooOOoo = Integer.valueOf(num8 == null ? typedArrayOooO0Oo.getInt(o000OO.Badge_badgeGravity, 8388661) : num8.intValue());
        State state12 = this.f15831OooO0O0;
        Integer num9 = state.f15858OooOo0;
        state12.f15858OooOo0 = Integer.valueOf(num9 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_horizontalOffset, 0) : num9.intValue());
        State state13 = this.f15831OooO0O0;
        Integer num10 = state.f15860OooOo0O;
        state13.f15860OooOo0O = Integer.valueOf(num10 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_verticalOffset, 0) : num10.intValue());
        State state14 = this.f15831OooO0O0;
        Integer num11 = state.f15861OooOo0o;
        state14.f15861OooOo0o = Integer.valueOf(num11 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_horizontalOffsetWithText, state14.f15858OooOo0.intValue()) : num11.intValue());
        State state15 = this.f15831OooO0O0;
        Integer num12 = state.f15857OooOo;
        state15.f15857OooOo = Integer.valueOf(num12 == null ? typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.Badge_verticalOffsetWithText, state15.f15860OooOo0O.intValue()) : num12.intValue());
        State state16 = this.f15831OooO0O0;
        Integer num13 = state.f15863OooOoO0;
        state16.f15863OooOoO0 = Integer.valueOf(num13 == null ? 0 : num13.intValue());
        State state17 = this.f15831OooO0O0;
        Integer num14 = state.f15862OooOoO;
        state17.f15862OooOoO = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        typedArrayOooO0Oo.recycle();
        Locale locale = state.f15852OooOOOO;
        if (locale == null) {
            this.f15831OooO0O0.f15852OooOOOO = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f15831OooO0O0.f15852OooOOOO = locale;
        }
        this.f15830OooO00o = state;
    }

    public final boolean OooO00o() {
        return this.f15831OooO0O0.f15851OooOOO0 != -1;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @StyleRes
        public Integer f15841OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @XmlRes
        public int f15842OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @ColorInt
        public Integer f15843OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ColorInt
        public Integer f15844OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @StyleRes
        public Integer f15845OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @StyleRes
        public Integer f15846OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @StyleRes
        public Integer f15847OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @StyleRes
        public Integer f15848OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f15849OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f15850OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f15851OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Locale f15852OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public CharSequence f15853OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @StringRes
        public int f15854OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @PluralsRes
        public int f15855OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Integer f15856OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15857OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15858OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public Boolean f15859OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15860OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15861OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15862OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f15863OooOoO0;

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
            this.f15849OooOO0o = 255;
            this.f15851OooOOO0 = -2;
            this.f15850OooOOO = -2;
            this.f15859OooOo00 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f15842OooO0Oo);
            parcel.writeSerializable(this.f15844OooO0o0);
            parcel.writeSerializable(this.f15843OooO0o);
            parcel.writeSerializable(this.f15845OooO0oO);
            parcel.writeSerializable(this.f15846OooO0oo);
            parcel.writeSerializable(this.f15841OooO);
            parcel.writeSerializable(this.f15847OooOO0);
            parcel.writeSerializable(this.f15848OooOO0O);
            parcel.writeInt(this.f15849OooOO0o);
            parcel.writeInt(this.f15851OooOOO0);
            parcel.writeInt(this.f15850OooOOO);
            CharSequence charSequence = this.f15853OooOOOo;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f15855OooOOo0);
            parcel.writeSerializable(this.f15856OooOOoo);
            parcel.writeSerializable(this.f15858OooOo0);
            parcel.writeSerializable(this.f15860OooOo0O);
            parcel.writeSerializable(this.f15861OooOo0o);
            parcel.writeSerializable(this.f15857OooOo);
            parcel.writeSerializable(this.f15863OooOoO0);
            parcel.writeSerializable(this.f15862OooOoO);
            parcel.writeSerializable(this.f15859OooOo00);
            parcel.writeSerializable(this.f15852OooOOOO);
        }

        public State(@NonNull Parcel parcel) {
            this.f15849OooOO0o = 255;
            this.f15851OooOOO0 = -2;
            this.f15850OooOOO = -2;
            this.f15859OooOo00 = Boolean.TRUE;
            this.f15842OooO0Oo = parcel.readInt();
            this.f15844OooO0o0 = (Integer) parcel.readSerializable();
            this.f15843OooO0o = (Integer) parcel.readSerializable();
            this.f15845OooO0oO = (Integer) parcel.readSerializable();
            this.f15846OooO0oo = (Integer) parcel.readSerializable();
            this.f15841OooO = (Integer) parcel.readSerializable();
            this.f15847OooOO0 = (Integer) parcel.readSerializable();
            this.f15848OooOO0O = (Integer) parcel.readSerializable();
            this.f15849OooOO0o = parcel.readInt();
            this.f15851OooOOO0 = parcel.readInt();
            this.f15850OooOOO = parcel.readInt();
            this.f15853OooOOOo = parcel.readString();
            this.f15855OooOOo0 = parcel.readInt();
            this.f15856OooOOoo = (Integer) parcel.readSerializable();
            this.f15858OooOo0 = (Integer) parcel.readSerializable();
            this.f15860OooOo0O = (Integer) parcel.readSerializable();
            this.f15861OooOo0o = (Integer) parcel.readSerializable();
            this.f15857OooOo = (Integer) parcel.readSerializable();
            this.f15863OooOoO0 = (Integer) parcel.readSerializable();
            this.f15862OooOoO = (Integer) parcel.readSerializable();
            this.f15859OooOo00 = (Boolean) parcel.readSerializable();
            this.f15852OooOOOO = (Locale) parcel.readSerializable();
        }
    }
}
