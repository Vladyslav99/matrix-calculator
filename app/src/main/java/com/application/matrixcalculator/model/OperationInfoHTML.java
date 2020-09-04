package com.application.matrixcalculator.model;

public class OperationInfoHTML {

    public static final String ADD_AND_SUB_HTML = "<h2>How to Add and Subtract Matrices</h2> \n" +
            "    <p>Two matrices may be added or subtracted only if they have the same\n" +
            "        dimension;\n" +
            "        that is, they must have the same number of rows and columns.</p>\n" +
            "        \n" +
            "    <p>Addition or subtraction is accomplished by adding or subtracting\n" +
            "        corresponding elements.  For example, consider matrix <strong>A</strong>\n" +
            "        and matrix <strong>B</strong>.</p>\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">3</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">7</td>\n" +
            "                    <td class=\"tdmatrixcell\">8</td>\n" +
            "                    <td class=\"tdmatrixcell\">9</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        <td style=\"width:50px;\"></td>\n" +
            "        <td><strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">5</td>\n" +
            "                    <td class=\"tdmatrixcell\">6</td>\n" +
            "                    <td class=\"tdmatrixcell\">7</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">3</td>\n" +
            "                    <td class=\"tdmatrixcell\">4</td>\n" +
            "                    <td class=\"tdmatrixcell\">5</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>Both matrices have the same number of rows and columns (2 rows and 3 columns), \n" +
            "        so they can be added and subtracted.  Thus,</p>\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> + <strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">1 + 5</td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">2 + 6</td>\n" +
            "                    <td class=\"tdmatrixcell\">3 + 7</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">7 + 3</td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">8 + 4</td>\n" +
            "                    <td class=\"tdmatrixcell\">9 + 5</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table><br />\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> + <strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">6</td>\n" +
            "                    <td class=\"tdmatrixcell\">8</td>\n" +
            "                    <td class=\"tdmatrixcell\">10</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">10</td>\n" +
            "                    <td class=\"tdmatrixcell\">12</td>\n" +
            "                    <td class=\"tdmatrixcell\">14</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>And,</p>\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> - <strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">1 - 5</td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">2 - 6</td>\n" +
            "                    <td class=\"tdmatrixcell\">3 - 7</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">7 - 3</td>\n" +
            "                    <td class=\"tdmatrixcell\" style=\"padding-right:20px;\">8 - 4</td>\n" +
            "                    <td class=\"tdmatrixcell\">9 - 5</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table><br />\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> - <strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">-4</td>\n" +
            "                    <td class=\"tdmatrixcell\">-4</td>\n" +
            "                    <td class=\"tdmatrixcell\">-4</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">4</td>\n" +
            "                    <td class=\"tdmatrixcell\">4</td>\n" +
            "                    <td class=\"tdmatrixcell\">4</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>And finally, note that the order in which matrices are added is not \n" +
            "        important; thus, <strong>A</strong> + <strong>B</strong> =\n" +
            "        <strong>B</strong> + <strong>A</strong>.</p>";

    public static final String MULTIPLICATION_HTML = "<h2>How to Multiply a Matrix by a Matrix</h2> \n" +
            "    <p>The matrix product <strong>A</strong><strong>B</strong> is defined only\n" +
            "        when the number of columns in <strong>A</strong> is equal to the \n" +
            "        number of rows in <strong>B</strong>.  Similarly, \n" +
            "        the matrix product <strong>B</strong><strong>A</strong> is defined only\n" +
            "        when the number of columns in <strong>B</strong> is equal to the \n" +
            "        number of rows in <strong>A</strong>.</p>\n" +
            "    \n" +
            "    <p>Suppose that <strong>A</strong> is an <i>i</i>&nbsp;x&nbsp;<i>j</i> matrix, and \n" +
            "        <strong>B</strong> is a <i>j</i>&nbsp;x&nbsp;<i>k</i> matrix.  Then, the matrix\n" +
            "        product <strong>A</strong><strong>B</strong> results in a matrix\n" +
            "        <strong>C</strong>, which has <i>i</i> rows and <i>k</i> columns; and\n" +
            "        each element in <strong>C</strong> can be computed according to the \n" +
            "        following formula.</p>\n" +
            "    \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        <i>C</i><sub>i</sub><sub>k</sub> = \n" +
            "            &Sigma;<sub>j</sub> \n" +
            "            <i>A</i><sub>i</sub><sub>j</sub><i>B</i><sub>j</sub><sub>k</sub>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>where</p>\n" +
            "    <p style=\"padding-left:30px;\">\n" +
            "        <i>C</i><sub>i</sub><sub>k</sub> = the element in row <i>i</i> and \n" +
            "            column <i>k</i> from matrix <strong>C</strong><br />\n" +
            "        <i>A</i><sub>i</sub><sub>j</sub> = the element in row <i>i</i> and \n" +
            "            column <i>j</i> from matrix <strong>A</strong><br />\n" +
            "        <i>B</i><sub>j</sub><sub>k</sub> = \n" +
            "            the element in row <i>j</i> and column <i>k</i>\n" +
            "            from matrix <strong>B</strong><br />\n" +
            "        &Sigma;<sub>j</sub> = summation sign, which indicates that the\n" +
            "            a<sub>i</sub><sub>j</sub>b<sub>j</sub><sub>k</sub> terms should be \n" +
            "            summed over <i>j</i>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>Let's work through an example to show how the above formula works.  \n" +
            "        Suppose we want to compute\n" +
            "        <strong>A</strong><strong>B</strong>, given the matrices below.</p>\n" +
            "       \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">3</td>\n" +
            "                    <td class=\"tdmatrixcell\">4</td>\n" +
            "                    <td class=\"tdmatrixcell\">5</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        <td style=\"width:40px;\">&nbsp;</td>\n" +
            "        <td><strong>B</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">6</td>\n" +
            "                    <td class=\"tdmatrixcell\">7</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">8</td>\n" +
            "                    <td class=\"tdmatrixcell\">9</td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">10</td>\n" +
            "                    <td class=\"tdmatrixcell\">11</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "        \n" +
            "    <p>Let <strong>A</strong><strong>B</strong> = <strong>C</strong>. \n" +
            "        Because <strong>A</strong> has 2 rows, we know that <strong>C</strong> will\n" +
            "        have two rows; and because <strong>B</strong> has 2 columns, we know that\n" +
            "        <strong>C</strong> will have 2 columns.\n" +
            "        To compute the value of every element in the 2 x 2 matrix <strong>C</strong>,\n" +
            "        we use the formula \n" +
            "        <i>C</i><sub>i</sub><sub>k</sub>&nbsp;=&nbsp;\n" +
            "        &Sigma;<sub>j</sub>&nbsp;<i>A</i><sub>i</sub><sub>j</sub><i>B</i><sub>j</sub><sub>k</sub>,\n" +
            "        as shown below.</p>\n" +
            "        \n" +
            "    <ul>\n" +
            "        <li><i>C</i><sub>1</sub><sub>1</sub> = &Sigma; <i>A</i><sub>1</sub><sub>j</sub><i>B</i><sub>j</sub><sub>1</sub>\n" +
            "            = 0*6 + 1*8 +2*10 = 0 + 8 + 20 = 28</li>\n" +
            "        <li><i>C</i><sub>1</sub><sub>2</sub> = &Sigma; <i>A</i><sub>1</sub><sub>j</sub><i>B</i><sub>j</sub><sub>2</sub>\n" +
            "            = 0*7 + 1*9 +2*11 = 0 + 9 + 22 = 31</li>\n" +
            "        <li><i>C</i><sub>2</sub><sub>1</sub> = &Sigma; <i>A</i><sub>2</sub><sub>j</sub><i>B</i><sub>j</sub><sub>1</sub>\n" +
            "            = 3*6 + 4*8 +5*10 = = 18 + 32 + 50 = 100</li>\n" +
            "        <li><i>C</i><sub>2</sub><sub>2</sub> = &Sigma; <i>A</i><sub>2</sub><sub>j</sub><i>B</i><sub>j</sub><sub>2</sub>\n" +
            "            = 3*7 + 4*9 +5*11 = 21 + 36 +55 = 112</li>        \n" +
            "    </ul>\n" +
            "    \n" +
            "    <p>Based on the above calculations, we can say</p>\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong><strong>B</strong>&nbsp;&nbsp; = &nbsp;&nbsp;<strong>C</strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">28</td>\n" +
            "                    <td class=\"tdmatrixcell\">31</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">100</td>\n" +
            "                    <td class=\"tdmatrixcell\">112</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>What we did to compute Matrix <strong>C</strong> was not \n" +
            "        complicated.  All we did was to multiply row elements in \n" +
            "        Matrix <strong>A</strong> by corresponding column elements in \n" +
            "        Matrix <strong>B</strong>.</p>\n" +
            "\n" +
            "    </section>\n" +
            "    \n" +
            "\n" +
            "    <aside class=\"InlineAdWrapper\">\n" +
            "\n" +
            "        <div id=\"divEzoic\">\n" +
            "\n" +
            "            <!-- Ezoic - middle-content - mid_content -->\n" +
            "            <div id=\"ezoic-pub-ad-placeholder-148\">\n" +
            "                <!-- In-Content (300x250) -->\n" +
            "                <div class=\"ad-tag srt-incontent\" data-ad-name=\"In-Content\" data-ad-size=\"300x250\" ></div>\n" +
            "                <script src=\"//tags-cdn.deployads.com/a/stattrek.com.js\" async ></script>\n" +
            "                <script>(deployads = window.deployads || []).push({});</script>\n" +
            "            </div>\n" +
            "            <!-- End Ezoic - middle-content - mid_content -->\n" +
            "\n" +
            "        </div>\n" +
            "\n" +
            "        \n" +
            "\n" +
            "            \n" +
            "          \n" +
            "    </aside>\n" +
            "\n" +
            "\n" +
            "\n" +
            "                    <div id=\"InArticleAd\">\n" +
            "                        \n" +
            "    <!-- To display InArticle ad, delete this content placeholder. To hide InArticle ad, \n" +
            "         leave this content placeholder in place. -->\n" +
            "\n" +
            "                    </div>\n" +
            "                    \n" +
            "\n" +
            "    <!-- Main content following InArticle ad. If there is no InArticle ad, \n" +
            "         delete the section element below. Otherwise, fill the section element with page content. -->\n" +
            "    <section class=\"main\" role=\"main\" >\n" +
            "\n" +
            "\t    <h2>Multiplication Order</h2>\n" +
            "    <p>As we have already mentioned, in some cases, matrix multiplication is \n" +
            "        defined for <strong>A</strong><strong>B</strong>, but not for\n" +
            "        <strong>B</strong><strong>A</strong>; and vice versa. However, \n" +
            "        even when matrix multiplication is possible in both directions, \n" +
            "        results may be different.  That is,\n" +
            "        <strong>A</strong><strong>B</strong> is not always equal to \n" +
            "        <strong>B</strong><strong>A</strong>.</p>\n" +
            "    \n" +
            "    <p>Because order is important, matrix algebra jargon has evolved to \n" +
            "        clearly indicate the order in which matrices are multiplied.</p>\n" +
            "    <ul>\n" +
            "        <li>To describe the matrix product <strong>A</strong><strong>B</strong>, \n" +
            "        we can say <strong>A</strong> is <i>postmultiplied</i>\n" +
            "        by <strong>B</strong>; or we can say that <strong>B</strong> is\n" +
            "        <i>premultiplied</i> by <strong>A</strong>.<br /><br /></li>\n" +
            "        <li>Similarly, to describe the matrix product \n" +
            "        <strong>B</strong><strong>A</strong>, \n" +
            "        we can say <strong>B</strong> is <i>postmultiplied</i>\n" +
            "        by <strong>A</strong>; or we can say that <strong>A</strong> is\n" +
            "        <i>premultiplied</i> by <strong>B</strong>.</li>\n" +
            "    </ul>\n" +
            "    \n" +
            "    <p>The bottom line: when you multiply two matrices, order matters.</p>\n" +
            "    \n" +
            "    <h2>Identity Matrix</h2>\n" +
            "    <p>The <strong>identity matrix</strong> is an \n" +
            "    <i>n</i> x <i>n</i>\n" +
            "   diagonal matrix\n" +
            "    with 1's in the diagonal and zeros everywhere else. The identity matrix\n" +
            "    is denoted by <strong>I</strong> or <strong>I<sub>n</sub></strong>. \n" +
            "    Two identity matrices appear below.</p>\n" +
            "    \n" +
            "    <table style=\"margin-right:auto; margin-left:auto;\"><tr>\n" +
            "        <td>\n" +
            "        <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "            <tr>\n" +
            "            <td><strong>I<sub>2</sub></strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "            <td style=\"padding-right:30px;\">\n" +
            "                <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                    <tr>\n" +
            "                        <td class=\"tdleftbracket\" rowspan=\"2\"></td>\n" +
            "                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdrightbracket\" rowspan=\"2\"></td>\n" +
            "                    </tr>\n" +
            "                    <tr>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                    </tr>\n" +
            "                </table>\n" +
            "            </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "        </td>\n" +
            "        <td>\n" +
            "        <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "            <tr>\n" +
            "            <td><strong>I<sub>3</sub></strong> = &nbsp;&nbsp;&nbsp;</td>\n" +
            "            <td style=\"padding-right:30px;\">\n" +
            "                <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "                    <tr>\n" +
            "                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                    </tr>\n" +
            "                    <tr>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                    </tr>\n" +
            "                    <tr>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                    </tr>\n" +
            "                </table>\n" +
            "            </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "        </td>\n" +
            "    </tr></table>\n" +
            "    \n" +
            "    <p>The identity matrix has a unique talent. Any matrix that can be \n" +
            "        premultiplied or postmultiplied by <strong>I</strong> remains the \n" +
            "        same; that is:</p>\n" +
            "        \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        <strong>A</strong><strong>I</strong> = <strong>I</strong><strong>A</strong> = \n" +
            "        <strong>A</strong>\n" +
            "    </p>";

    public static final String DETERMINANT_HTML = " <h2>How to Compute the Determinant of an <i>n</i> x <i>n</i> Matrix</h2>\n" +
            "    <p>The formula for computing the determinant of a 2 x 2 matrix (shown above) \n" +
            "        is actually a\n" +
            "        special case of the general algorithm for computing the determinant of\n" +
            "        any square matrix.</p>\n" +
            "        \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        |<strong>A</strong>| = &Sigma; ( <u>+</u> ) \n" +
            "        <i>A</i><sub>1</sub><sub>q</sub><i>A</i><sub>2</sub><sub>r</sub><i>A</i><sub>3</sub><sub>s</sub>\n" +
            "        . . . <i>A</i><sub>n</sub><sub>z</sub>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>This algorithm requires some explanation.  Here are the key points.</p>\n" +
            "    \n" +
            "    <ul>\n" +
            "        <li>The determinant is the sum of product terms made up of elements \n" +
            "            from the matrix.</li>\n" +
            "        <li>Each product term consists of <i>n</i> elements from the matrix.</li>\n" +
            "        <li>Each product term includes one element from each row and one\n" +
            "            element from each column.</li>\n" +
            "        <li>The number of product terms is equal to <i>n</i>!   \n" +
            "            (where <i>n</i>! refers to <i>n</i>\n" +
            "            factorial).</li>\n" +
            "        <li>By convention, the elements of each product term are arranged in \n" +
            "            ascending order of the left-hand (or row-designating) subscript.</li>\n" +
            "        <li>To find the sign of each product term, we count the number of\n" +
            "            inversions needed to put the right-hand (or column-designating) \n" +
            "            subscripts in numerical order.  If the number of inversions is \n" +
            "            even, the sign is positive; if odd, the sign is negative.</li>\n" +
            "    </ul>    \n" +
            "    \n" +
            "    <p>Unless you are a computer, this explanation is probably still confusing, so \n" +
            "        let's work through an example.  \n" +
            "        Suppose <strong>A</strong> is a 3 x 3 matrix with elements \n" +
            "        <i>A</i><sub>i</sub><sub>j</sub>, as shown below.</p>\n" +
            "        \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>\n" +
            "        <td><strong>A</strong>&nbsp;&nbsp;=&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table style=\"margin-right:10px;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>1</sub><sub>1</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>1</sub><sub>2</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>1</sub><sub>3</sub></td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>2</sub><sub>1</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>2</sub><sub>2</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>2</sub><sub>3</sub></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>3</sub><sub>1</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>3</sub><sub>2</sub></td>\n" +
            "                    <td class=\"tdmatrixcell\"><i>A</i><sub>3</sub><sub>3</sub></td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>To begin, let's list each product term.  In constructing this list,\n" +
            "        we will arrange elements of each product term in ascending order\n" +
            "        of their row-designating subscript.  Our list of product terms appears\n" +
            "        below.</p>\n" +
            "    <p style=\"text-align:center;\">\n" +
            "        |<strong>A</strong>| = &Sigma; ( <u>+</u> ) \n" +
            "        <i>A</i><sub>1</sub><sub>q</sub><i>A</i><sub>2</sub><sub>r</sub><i>A</i><sub>3</sub><sub>s</sub>\n" +
            "        . . . <i>A</i><sub>n</sub><sub>z</sub> <br /><br />\n" +
            "        |<strong>A</strong>| = \n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>2</sub><sub>2</sub><i>A</i><sub>3</sub><sub>3</sub>\n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>1</sub>\n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>3</sub><i>A</i><sub>2</sub><sub>1</sub><i>A</i><sub>3</sub><sub>2</sub>\n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>3</sub><i>A</i><sub>2</sub><sub>2</sub><i>A</i><sub>3</sub><sub>1</sub>\n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>1</sub><i>A</i><sub>3</sub><sub>3</sub>\n" +
            "        &nbsp;<u>+</u>&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>2</sub>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>Note that we have 3! or 6 product terms, each consisting of \n" +
            "        one element from each row\n" +
            "        and one element from each column.  The task remaining\n" +
            "        is to find the sign for each product term.  To do this, we count the \n" +
            "        number of inversions needed to put elements in ascending order of their\n" +
            "        column-designating subscript.</p>\n" +
            "    <p>To demonstrate how to count inversions, let's look at two of the \n" +
            "        product terms.</p>\n" +
            "        \n" +
            "    <ul>\n" +
            "        <li>Consider\n" +
            "        the second product term in the list:\n" +
            "        <i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>1</sub>.\n" +
            "        To put all of the column-designating subscripts in ascending order, \n" +
            "        we need to move <i>A</i><sub>3</sub><sub>1</sub> from the end of the term to the \n" +
            "        front of the term, which results in:\n" +
            "        <i>A</i><sub>3</sub><sub>1</sub><i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>3</sub>.\n" +
            "        This movement counts as two inversions, since we moved \n" +
            "        <i>A</i><sub>3</sub><sub>1</sub> two positions to the left.\n" +
            "        Since two is an even number, the sign\n" +
            "        of that product term should be positive.</li>\n" +
            "        <li>Consider\n" +
            "        the last product term in the list:\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>2</sub>.\n" +
            "        To put all of the column-designating subscripts in ascending order, \n" +
            "        we need to interchange the second and third elements, which results in:\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>3</sub><sub>2</sub><i>A</i><sub>2</sub><sub>3</sub>.\n" +
            "        This counts as one inversion, since we moved \n" +
            "        <i>A</i><sub>3</sub><sub>2</sub> one position to the left.\n" +
            "        Since one is an odd number, the sign\n" +
            "        of that product term should be negative.</li>\n" +
            "    </ul>\n" +
            "        \n" +
            "    <p>If we repeat this process for each of the other product terms, \n" +
            "        we get the following formula for the determinant of a 3 x 3 matrix.</p>    \n" +
            "        \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        |<strong>A</strong>| = &Sigma; ( <u>+</u> ) \n" +
            "        <i>A</i><sub>1</sub><sub>q</sub><i>A</i><sub>2</sub><sub>r</sub><i>A</i><sub>3</sub><sub>s</sub>\n" +
            "        . . . <i>A</i><sub>n</sub><sub>z</sub> <br /><br />\n" +
            "        |<strong>A</strong>| = \n" +
            "        &nbsp;+&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>2</sub><sub>2</sub><i>A</i><sub>3</sub><sub>3</sub>\n" +
            "        &nbsp;+&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>1</sub>\n" +
            "        &nbsp;+&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>3</sub><i>A</i><sub>2</sub><sub>1</sub><i>A</i><sub>3</sub><sub>2</sub>\n" +
            "        &nbsp;-&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>3</sub><i>A</i><sub>2</sub><sub>2</sub><i>A</i><sub>3</sub><sub>1</sub>\n" +
            "        &nbsp;-&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>2</sub><i>A</i><sub>2</sub><sub>1</sub><i>A</i><sub>3</sub><sub>3</sub>\n" +
            "        &nbsp;-&nbsp;\n" +
            "        <i>A</i><sub>1</sub><sub>1</sub><i>A</i><sub>2</sub><sub>3</sub><i>A</i><sub>3</sub><sub>2</sub>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>We can employ the same process to compute the determinant for any size matrix.\n" +
            "        However, as the matrix gets larger, the number of product terms increases \n" +
            "        very quickly.  For example, a 4 x 4 matrix would have 4! or 24 terms;\n" +
            "        a 5 x 5 matrix, 120 terms; a 6 x 6 matrix, 720 terms, and so on.  \n" +
            "        A 10 x 10 matrix would have 3,628,800 terms.  You would not want to\n" +
            "        calculate the determinant of a large matrix by hand.</p>";

    public static  final String INVERSE_HTML = "<h2>How to Find the Inverse of an <i>n</i> x <i>n</i> Matrix</h2> \n" +
            "    <p>Let <strong>A</strong> be an <i>n</i> x <i>n</i> matrix.  To find the\n" +
            "        inverse of matrix <strong>A</strong>, we follow these steps:</p>\n" +
            "        \n" +
            "    <ol>\n" +
            "        <li>Using \n" +
            "            elementary operators,\n" +
            "            transform matrix <strong>A</strong> to its\n" +
            "            \n" +
            "            reduced row echelon form, <strong>A</strong><sub>rref</sub>.</li>\n" +
            "        <li>Inspect <strong>A</strong><sub>rref</sub> to determine if \n" +
            "            matrix <strong>A</strong> has an inverse.\n" +
            "            <ul style=\"margin-top:1rem;\">\n" +
            "                <li>If <strong>A</strong><sub>rref</sub> is equal to the \n" +
            "                \n" +
            "                identity matrix, then matrix <strong>A</strong> is  \n" +
            "                full rank;\n" +
            "                and matrix <strong>A</strong> has an inverse.</li>\n" +
            "                <li>If the last row of <strong>A</strong><sub>rref</sub> is \n" +
            "                all zeros, then matrix <strong>A</strong> is not \n" +
            "                full rank;\n" +
            "                and matrix <strong>A</strong> does not have an inverse.</li>\n" +
            "            </ul>  \n" +
            "        </li>\n" +
            "        <li>If <strong>A</strong> is full rank, then the inverse of matrix \n" +
            "            <strong>A</strong> is equal to the product of the elementary operators\n" +
            "            that produced <strong>A</strong><sub>rref</sub> , as shown below.</li>\n" +
            "    </ol>\n" +
            "    \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        <strong>A</strong><sup>-1</sup> =\n" +
            "        <strong>E</strong><sub>r</sub> <strong>E</strong><sub>r-1</sub> . . .\n" +
            "        <strong>E</strong><sub>2</sub> <strong>E</strong><sub>1</sub>\n" +
            "    </p>\n" +
            "        \n" +
            "    <p style=\"margin-left:40px;\">where</p>\n" +
            "    \n" +
            "    <p style=\"margin-left:40px;\">\n" +
            "        <strong>A</strong><sup>-1</sup> = inverse of matrix <strong>A</strong><br />\n" +
            "        <i>r</i> = Number of elementary row operations required to \n" +
            "        transform <strong>A</strong> to  \n" +
            "        <strong>A</strong><sub>rref</sub><br />\n" +
            "        <strong>E</strong><sub>i</sub> = <i>i</i>th elementary row operator \n" +
            "        used to transform <strong>A</strong> to <strong>A</strong><sub>rref</sub>\n" +
            "    </p>\n" +
            "    \n" +
            "    <p>Note that the order in which elementary row operators are multiplied\n" +
            "        is important, because \n" +
            "        <strong>E</strong><sub>i</sub> <strong>E</strong><sub>j</sub>\n" +
            "        is not necessarily equal to \n" +
            "        <strong>E</strong><sub>j</sub> <strong>E</strong><sub>i</sub>.</p>\n" +
            "        \n" +
            "\n" +
            "    <aside class=\"InlineAdWrapper\">\n" +
            "\n" +
            "        <div id=\"divEzoic\">\n" +
            "\n" +
            "            <!-- Ezoic - middle-content - mid_content -->\n" +
            "            <div id=\"ezoic-pub-ad-placeholder-148\">\n" +
            "                <!-- In-Content (300x250) -->\n" +
            "                <div class=\"ad-tag srt-incontent\" data-ad-name=\"In-Content\" data-ad-size=\"300x250\" ></div>\n" +
            "                <script src=\"//tags-cdn.deployads.com/a/stattrek.com.js\" async ></script>\n" +
            "                <script>(deployads = window.deployads || []).push({});</script>\n" +
            "            </div>\n" +
            "            <!-- End Ezoic - middle-content - mid_content -->\n" +
            "\n" +
            "        </div>\n" +
            "\n" +
            "        \n" +
            "\n" +
            "            \n" +
            "          \n" +
            "    </aside>\n" +
            "\n" +
            "\n" +
            "    <a name=\"FindInverse\"></a>\n" +
            "    <h2>An Example of Finding the Inverse</h2>\n" +
            "    <p>Let's use the above method to find the inverse of matrix\n" +
            "        <strong>A</strong>, shown below.</p>\n" +
            "    \n" +
            "    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "        <tr>        \n" +
            "        <td><strong>A</strong>&nbsp;&nbsp;&nbsp;=&nbsp;&nbsp;&nbsp;</td>\n" +
            "        <td>\n" +
            "            <table>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">2</td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    \n" +
            "    <p>The first step is to transform matrix <strong>A</strong> into its\n" +
            "       \n" +
            "        reduced row echelon form, <strong>A</strong><sub>rref</sub>, \n" +
            "        using a series of \n" +
            "        \n" +
            "        elementary row operators \n" +
            "        <strong>E</strong><sub><i>i</i></sub>.  We show the transformation\n" +
            "        steps below for each elementary row operator.</p>\n" +
            "\n" +
            "        <ol start=\"1\">\n" +
            "            <li>Multiply row 1 of <strong>A</strong> by -2 and add the \n" +
            "            result to row 2 of <strong>A</strong>. This can be accomplished by pre-multiplying <strong>A</strong> by \n" +
            "            the elementary row operator <strong>E</strong><sub>1</sub>, which produces <strong>A</strong><sub>1</sub>.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>1</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>A</strong><sub>1</sub>&nbsp;=&nbsp;<strong>E</strong><sub>1</sub><strong>A</strong>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "\n" +
            "        <ol start=\"2\" >\n" +
            "            <li>Multiply row 1 of <strong>A</strong><sub>1</sub> by -2 and add the \n" +
            "            result to row 3 of <strong>A</strong><sub>1</sub>.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>2</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong><strong>A</strong><sub>2</sub>&nbsp;=&nbsp;E</strong><sub>2</sub><strong>A</strong><sub>1</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-3</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "\n" +
            "        <ol start=\"3\" >\n" +
            "            <li>Multiply row 3 of <strong>A</strong><sub>2</sub> by -1 and add  \n" +
            "            row 2 of <strong>A</strong><sub>2</sub> to \n" +
            "            row 3 of <strong>A</strong><sub>2</sub>.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>3</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong><strong>A</strong><sub>3</sub>&nbsp;=&nbsp;E</strong><sub>3</sub><strong>A</strong><sub>2</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">2</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "\n" +
            "        <ol start=\"4\" >\n" +
            "            <li>Add row 2 of <strong>A</strong><sub>3</sub> to \n" +
            "            row 1 of <strong>A</strong><sub>3</sub>.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>4</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                <tr>\n" +
            "                                    <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                </tr>\n" +
            "                                <tr>\n" +
            "                                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                                </tr>\n" +
            "                                <tr>\n" +
            "                                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                                </tr>\n" +
            "                            </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>A</strong><sub>4</sub>&nbsp;=&nbsp;<strong>E</strong><sub>4</sub><strong>A</strong><sub>3</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-2</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "\n" +
            "        <ol start=\"5\" >\n" +
            "            <li>Multiply row 2 of <strong>A</strong><sub>4</sub> by -0.5.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>5</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-0.5</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>A</strong><sub>5</sub>&nbsp;=&nbsp;<strong>E</strong><sub>5</sub><strong>A</strong><sub>4</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "\n" +
            "        <ol start=\"6\" >\n" +
            "            <li>Multiply row 3 of <strong>A</strong><sub>5</sub> by -1\n" +
            "                and add the result to row 2 of <strong>A</strong><sub>5</sub>.\n" +
            "            </li>\n" +
            "        </ol>\n" +
            "\n" +
            "        <table style=\"margin:0px auto 20px auto;\">\n" +
            "            <tr>\n" +
            "                <td style=\"padding-right:30px;\">\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>E</strong><sub>6</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td>\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">-1</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "                <td>\n" +
            "                    <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                        <tr>\n" +
            "                            <td><strong>A</strong><sub>rref</sub>&nbsp;=&nbsp;<strong>E</strong><sub>6</sub><strong>A</strong><sub>5</sub>&nbsp;=&nbsp;</td>\n" +
            "                            <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "                                <table style=\"margin-left:auto; margin-right:auto;\">\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">0</td>\n" +
            "                                        <td class=\"tdmatrixcell\">1</td>\n" +
            "                                    </tr>\n" +
            "                                </table>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </table>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "        </table>\n" +
            "        \n" +
            "    <p><strong>Note:</strong> If the operations and/or notation shown above are unclear, please review  \n" +
            "    \n" +
            "    elementary matrix operations and\n" +
            "    \n" +
            "    echelon transformations.</p>\n" +
            "        \n" +
            "    <p>The last matrix in Step 6 of the above table is \n" +
            "    <strong>A</strong><sub>rref</sub>, the reduced row echelon form for \n" +
            "    matrix <strong>A</strong>.  Since <strong>A</strong><sub>rref</sub> \n" +
            "    is equal to the identity matrix, we know that <strong>A</strong> is \n" +
            "    full rank.  \n" +
            "    And because <strong>A</strong> is full rank, we know that <strong>A</strong>\n" +
            "    has an inverse.</p>\n" +
            "    \n" +
            "    <p>If <strong>A</strong> were less than full rank, \n" +
            "    <strong>A</strong><sub>rref</sub> would have all zeros in the last row; and \n" +
            "    <strong>A</strong> would not have an\n" +
            "    inverse.</p>\n" +
            "        \n" +
            "    <p>We find the inverse of matrix <strong>A</strong>\n" +
            "    by computing the product of the elementary operators\n" +
            "    that produced <strong>A</strong><sub>rref</sub> , as shown below.</p>\n" +
            "    \n" +
            "    <p style=\"text-align:center;\">\n" +
            "        <strong>A</strong><sup>-1</sup> =\n" +
            "        <strong>E</strong><sub>6</sub> <strong>E</strong><sub>5</sub>\n" +
            "        <strong>E</strong><sub>4</sub> <strong>E</strong><sub>3</sub>\n" +
            "        <strong>E</strong><sub>2</sub> <strong>E</strong><sub>1</sub>\n" +
            "    </p>    \n" +
            "    \n" +
            "    <table style=\"margin-right:auto; margin-left:auto;\">\n" +
            "    <tr>\n" +
            "        <td><strong>A</strong><sup>-1</sup>&nbsp;=&nbsp;</td>\n" +
            "        <td class=\"StdTabB\" style=\"text-align:center;\">\n" +
            "            <table style=\"margin-left:auto; margin-right:auto; margin-top:20px;\">\n" +
            "                <tr>\n" +
            "                    <td class=\"tdleftbracket\" rowspan=\"3\"></td>\n" +
            "                    <td class=\"tdmatrixcell\">-1</td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                    <td class=\"tdrightbracket\" rowspan=\"3\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">-1.5</td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td class=\"tdmatrixcell\">0</td>\n" +
            "                    <td class=\"tdmatrixcell\">1</td>\n" +
            "                    <td class=\"tdmatrixcell\">-1</td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "    </tr></table>\n" +
            "        \n" +
            "    <p>In this example, we used a 3 x 3 matrix to show how to find a matrix inverse.  \n" +
            "        The same process will work on a square matrix of any size.</p>";


}
