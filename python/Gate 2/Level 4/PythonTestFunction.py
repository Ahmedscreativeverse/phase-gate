

import unittest import TestCase


from PythonFunction import add_two_numbers

class TestAddFunction(TestCase):

    
    
    
    def test_add_two_numbers(self):
        actual = add_two_numbers(2, 2)
        expected = 4
        self.assertEqual(actual, expected)

    
    
    
    def test_add_negative_numbers(self):
        actual = add_two_numbers(-1, -2)
        expected = -3
        self.assertEqual(actual, expected)
        
        
   
   
