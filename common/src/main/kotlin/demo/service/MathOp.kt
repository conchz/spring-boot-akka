package demo.service

import java.io.Serializable

interface MathOp : Serializable

class Add(val n1: Int, val n2: Int) : MathOp