package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "target", "toRadians", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,553:1\n552#1:560\n33#2,6:554\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:560\n174#1:554,6\n*E\n"})
public final class PathParserKt {

    @NotNull
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * dCos;
        double d14 = d4 * dSin;
        double d15 = (d13 * dSin2) - (d14 * dCos2);
        double d16 = d12 * dSin;
        double d17 = d4 * dCos;
        double d18 = (dCos2 * d17) + (dSin2 * d16);
        double d19 = d9 / ((double) iCeil);
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < iCeil) {
            double d25 = d24 + d19;
            double dSin3 = Math.sin(d25);
            double dCos3 = Math.cos(d25);
            int i2 = iCeil;
            double d26 = (((d10 * dCos) * dCos3) + d) - (d14 * dSin3);
            double d27 = (d17 * dSin3) + (d10 * dSin * dCos3) + d2;
            double d28 = (d13 * dSin3) - (d14 * dCos3);
            double d29 = (dCos3 * d17) + (dSin3 * d16);
            double d30 = d25 - d24;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d11) - ((double) 1)) * Math.sin(d30)) / ((double) 3);
            path.cubicTo((float) ((d22 * dSqrt) + d20), (float) ((d21 * dSqrt) + d23), (float) (d26 - (dSqrt * d28)), (float) (d27 - (dSqrt * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            dSin = dSin;
            d23 = d27;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            dCos = dCos;
            d10 = d3;
            iCeil = i2;
        }
    }

    private static final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = ((d2 * dSin) + (d * dCos)) / d5;
        double d12 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d13 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d14 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d16 * d16) + (d15 * d15);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d15 * dSqrt2;
        double d23 = dSqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d12 - d9, d11 - d8);
        double dAtan3 = Math.atan2(d14 - d9, d13 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        arcToBezier(path, (d24 * dCos) - (d25 * dSin), (d25 * dCos) + (d24 * dSin), d5, d6, d, d2, d10, dAtan2, dAtan3);
    }

    @NotNull
    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    @NotNull
    public static final Path toPath(@NotNull List<? extends PathNode> list, @NotNull Path path) {
        PathNode pathNode;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float x1;
        float y1;
        float dx;
        float dy;
        float y2;
        float f4;
        float f5;
        float f6;
        float f7;
        float y;
        float x;
        float x2;
        float y3;
        float x3;
        float y4;
        List<? extends PathNode> list2 = list;
        Path target = path;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        int iMo1580getFillTypeRgk1Os = path.mo1580getFillTypeRgk1Os();
        path.rewind();
        target.mo1582setFillTypeoQ8Xj4U(iMo1580getFillTypeRgk1Os);
        PathNode pathNode2 = list.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list.size();
        float f8 = 0.0f;
        int i3 = 0;
        float f9 = 0.0f;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float y5 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i3 < size) {
            PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof PathNode.Close) {
                path.close();
                target.moveTo(f10, f11);
                f9 = f10;
                arcStartX = f9;
                arcStartY = f11;
                y5 = arcStartY;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x3 = relativeMoveTo.getDx() + arcStartX;
                    y4 = relativeMoveTo.getDy() + y5;
                    target.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        x3 = moveTo.getX();
                        y4 = moveTo.getY();
                        target.moveTo(moveTo.getX(), moveTo.getY());
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            target.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x2 = relativeLineTo.getDx() + arcStartX;
                            y3 = relativeLineTo.getDy() + y5;
                        } else if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            target.lineTo(lineTo.getX(), lineTo.getY());
                            x2 = lineTo.getX();
                            y3 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                target.relativeLineTo(relativeHorizontalTo.getDx(), f8);
                                x = relativeHorizontalTo.getDx() + arcStartX;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                target.lineTo(horizontalTo.getX(), y5);
                                x = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    target.relativeLineTo(f8, relativeVerticalTo.getDy());
                                    y = relativeVerticalTo.getDy() + y5;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    target.lineTo(arcStartX, verticalTo.getY());
                                    y = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        pathNode = pathNode3;
                                        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        x1 = relativeCurveTo.getDx2() + arcStartX;
                                        y1 = relativeCurveTo.getDy2() + y5;
                                        dx = relativeCurveTo.getDx3() + arcStartX;
                                        dy = relativeCurveTo.getDy3();
                                    } else {
                                        pathNode = pathNode3;
                                        if (pathNode instanceof PathNode.CurveTo) {
                                            PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode;
                                            path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                            x1 = curveTo.getX2();
                                            y1 = curveTo.getY2();
                                            dx = curveTo.getX3();
                                            y2 = curveTo.getY3();
                                        } else if (pathNode instanceof PathNode.RelativeReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                f7 = y5 - arcStartY;
                                                f6 = arcStartX - f9;
                                            } else {
                                                f6 = f8;
                                                f7 = f6;
                                            }
                                            PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode;
                                            path.relativeCubicTo(f6, f7, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                            x1 = relativeReflectiveCurveTo.getDx1() + arcStartX;
                                            y1 = relativeReflectiveCurveTo.getDy1() + y5;
                                            dx = relativeReflectiveCurveTo.getDx2() + arcStartX;
                                            dy = relativeReflectiveCurveTo.getDy2();
                                        } else if (pathNode instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f12 = 2;
                                                f5 = (f12 * y5) - arcStartY;
                                                f4 = (arcStartX * f12) - f9;
                                            } else {
                                                f4 = arcStartX;
                                                f5 = y5;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode;
                                            path.cubicTo(f4, f5, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x1 = reflectiveCurveTo.getX1();
                                            y1 = reflectiveCurveTo.getY1();
                                            dx = reflectiveCurveTo.getX2();
                                            y2 = reflectiveCurveTo.getY2();
                                        } else if (pathNode instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode;
                                            target.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            x1 = relativeQuadTo.getDx1() + arcStartX;
                                            y1 = relativeQuadTo.getDy1() + y5;
                                            dx = relativeQuadTo.getDx2() + arcStartX;
                                            dy = relativeQuadTo.getDy2();
                                        } else if (pathNode instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode;
                                            target.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            x1 = quadTo.getX1();
                                            y1 = quadTo.getY1();
                                            dx = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f2 = arcStartX - f9;
                                                f3 = y5 - arcStartY;
                                            } else {
                                                f2 = f8;
                                                f3 = f2;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode;
                                            target.relativeQuadraticBezierTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x1 = f2 + arcStartX;
                                            y1 = f3 + y5;
                                            dx = relativeReflectiveQuadTo.getDx() + arcStartX;
                                            dy = relativeReflectiveQuadTo.getDy();
                                        } else if (pathNode instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f13 = 2;
                                                arcStartX = (arcStartX * f13) - f9;
                                                y5 = (f13 * y5) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode;
                                            target.quadraticBezierTo(arcStartX, y5, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float x4 = reflectiveQuadTo.getX();
                                            pathNode3 = pathNode;
                                            arcStartY = y5;
                                            f = f8;
                                            i = i3;
                                            i2 = size;
                                            y5 = reflectiveQuadTo.getY();
                                            f9 = arcStartX;
                                            arcStartX = x4;
                                        } else if (pathNode instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + arcStartX;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y5;
                                            pathNode3 = pathNode;
                                            i = i3;
                                            f = 0.0f;
                                            i2 = size;
                                            drawArc(path, arcStartX, y5, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            f9 = arcStartDx;
                                            arcStartX = f9;
                                            f10 = f10;
                                            f11 = f11;
                                            arcStartY = arcStartDy;
                                            y5 = arcStartY;
                                        } else {
                                            float f14 = f10;
                                            float f15 = f11;
                                            f = f8;
                                            i = i3;
                                            i2 = size;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                pathNode3 = pathNode;
                                                drawArc(path, arcStartX, y5, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                arcStartY = arcTo.getArcStartY();
                                                y5 = arcStartY;
                                                f10 = f14;
                                                f11 = f15;
                                                f9 = arcStartX;
                                            } else {
                                                pathNode3 = pathNode;
                                                f10 = f14;
                                                f11 = f15;
                                            }
                                        }
                                        pathNode3 = pathNode;
                                        arcStartX = dx;
                                        y5 = y2;
                                        f = f8;
                                        i = i3;
                                        i2 = size;
                                        arcStartY = y1;
                                        f9 = x1;
                                    }
                                    y2 = dy + y5;
                                    pathNode3 = pathNode;
                                    arcStartX = dx;
                                    y5 = y2;
                                    f = f8;
                                    i = i3;
                                    i2 = size;
                                    arcStartY = y1;
                                    f9 = x1;
                                }
                                y5 = y;
                            }
                            arcStartX = x;
                        }
                        y5 = y3;
                        arcStartX = x2;
                    }
                    i3 = i + 1;
                    target = path;
                    size = i2;
                    pathNode2 = pathNode3;
                    f8 = f;
                    list2 = list;
                }
                arcStartX = x3;
                f10 = arcStartX;
                y5 = y4;
                f11 = y5;
            }
            f = f8;
            i = i3;
            i2 = size;
            i3 = i + 1;
            target = path;
            size = i2;
            pathNode2 = pathNode3;
            f8 = f;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }
}
