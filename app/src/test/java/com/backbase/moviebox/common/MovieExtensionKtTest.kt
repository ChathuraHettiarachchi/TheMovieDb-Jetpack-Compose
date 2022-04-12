package com.backbase.moviebox.common

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MovieExtensionKtTest{

    @Test
    fun `verity string new line add requested amount of lines isTrue`(){
        val string = "Hello".addEmptyLines(3)
        val lineCount = string.lines()

        // with text + new 3 lines = 4
        assertThat(lineCount.size == 4).isTrue()
    }
}